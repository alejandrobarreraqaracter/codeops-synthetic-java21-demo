package com.qaracter.codeopsdemo.commons.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SingleResponse", description = "Synthetic single response payload")
public class SingleResponse<T> {

    @ApiModelProperty(value = "Response metadata", required = true)
    private ResponseCode responseCode;

    @ApiModelProperty(value = "Response body", required = true)
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
