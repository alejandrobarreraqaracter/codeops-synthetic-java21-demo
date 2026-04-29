package com.qaracter.codeopsdemo.controller;

import com.qaracter.codeopsdemo.commons.model.ResponseCode;
import com.qaracter.codeopsdemo.commons.model.SingleResponse;
import com.qaracter.codeopsdemo.model.PolicyRequest;
import com.qaracter.codeopsdemo.model.PolicyResponse;
import com.qaracter.codeopsdemo.service.PolicyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Synthetic policies")
@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyService policyService;

    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @ApiOperation(value = "Evaluate a synthetic policy")
    @PostMapping("/evaluate")
    public SingleResponse<PolicyResponse> evaluate(@RequestBody PolicyRequest request) {
        SingleResponse<PolicyResponse> response = new SingleResponse<>();
        response.setResponseCode(new ResponseCode("OK", "Synthetic policy evaluated"));
        response.setData(policyService.evaluate(request));
        return response;
    }
}
