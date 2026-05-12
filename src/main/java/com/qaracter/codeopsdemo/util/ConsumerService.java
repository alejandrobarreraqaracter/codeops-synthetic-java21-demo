package com.qaracter.codeopsdemo.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    public int postJson(String url, String payload) throws IOException {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            StringEntity entityJson = new StringEntity(payload, ContentType.APPLICATION_JSON.withCharset(StandardCharsets.UTF_8));
            HttpPost postRequest = new HttpPost(url);
            postRequest.setEntity(entityJson);
            postRequest.setHeader("Content-Type", "application/json");
            try (CloseableHttpResponse response = client.execute(postRequest)) {
                return response.getCode();
            }
        }
    }
}
