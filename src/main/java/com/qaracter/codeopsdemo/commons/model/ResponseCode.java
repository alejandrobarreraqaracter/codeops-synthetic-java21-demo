package com.qaracter.codeopsdemo.commons.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ResponseCode", description = "Synthetic response code wrapper")
public class ResponseCode {

    @ApiModelProperty(value = "Business response code", required = true, allowableValues = "OK,ERROR")
    private String code;

    @ApiModelProperty(value = "Human readable message", required = true)
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
