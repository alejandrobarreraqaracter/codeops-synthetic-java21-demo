package com.qaracter.codeopsdemo.model;

public class PolicyResponse {

    private String policyId;
    private String status;

    public PolicyResponse() {
    }

    public PolicyResponse(String policyId, String status) {
        this.policyId = policyId;
        this.status = status;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
