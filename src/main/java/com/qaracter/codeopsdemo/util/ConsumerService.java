package com.qaracter.codeopsdemo.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.http.client.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    public int postJson(String url, String payload) throws ClientProtocolException, IOException {
        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
            StringEntity entityJson = new StringEntity(payload, StandardCharsets.UTF_8);
            HttpPost postRequest = new HttpPost(url);
            postRequest.setEntity(entityJson);
            postRequest.setHeader("Content-Type", "application/json");
            try (CloseableHttpResponse response = client.execute(postRequest)) {
                return response.getCode();
            }
        }
    }
}
