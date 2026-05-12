package com.qaracter.codeopsdemo.commons.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ResponseCode", description = "Synthetic response code wrapper")
public class ResponseCode {

    @Schema(description = "Business response code", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"OK", "ERROR"})
    private String code;

    @Schema(description = "Human readable message", requiredMode = Schema.RequiredMode.REQUIRED)
    private String message;

    public ResponseCode() {
    }

    public ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
