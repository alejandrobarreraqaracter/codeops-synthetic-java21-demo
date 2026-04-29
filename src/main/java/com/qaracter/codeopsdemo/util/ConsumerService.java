package com.qaracter.codeopsdemo.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.HttpClient;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    public int postJson(String url, String payload) throws ClientProtocolException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        StringEntity entityJson = new StringEntity(payload, StandardCharsets.UTF_8);
        HttpPost postRequest = new HttpPost(url);
        postRequest.setEntity(entityJson);
        postRequest.setHeader("Content-Type", "application/json");
        HttpResponse response = client.execute(postRequest);
        return response.getStatusLine().getStatusCode();
    }
}
