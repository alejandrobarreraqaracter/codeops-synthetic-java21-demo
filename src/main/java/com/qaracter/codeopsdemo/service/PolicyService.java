package com.qaracter.codeopsdemo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaracter.codeopsdemo.model.PolicyRequest;
import com.qaracter.codeopsdemo.model.PolicyResponse;
import com.qaracter.codeopsdemo.util.ConsumerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    private final ConsumerService consumerService;
    private final ObjectMapper objectMapper;

    @Value("${legacy.downstream.policy-url}")
    private String downstreamUrl;

    public PolicyService(ConsumerService consumerService, ObjectMapper objectMapper) {
        this.consumerService = consumerService;
        this.objectMapper = objectMapper;
    }

    public PolicyResponse evaluate(PolicyRequest request) {
        try {
            String payload = objectMapper.writeValueAsString(request);
            int status = consumerService.postJson(downstreamUrl, payload);
            return new PolicyResponse(request.getPolicyId(), status < 400 ? "ACCEPTED" : "REVIEW");
        } catch (Exception ex) {
            return new PolicyResponse(request.getPolicyId(), "ERROR");
        }
    }
}
