package com.qaracter.codeopsdemo.commons.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "SingleResponse", description = "Synthetic single response payload")
public class SingleResponse<T> {

    @Schema(description = "Response metadata", requiredMode = Schema.RequiredMode.REQUIRED)
    private ResponseCode responseCode;

    @Schema(description = "Response body", requiredMode = Schema.RequiredMode.REQUIRED)
    private T data;

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
