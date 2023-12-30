package com.rajkarnikarunish.movies.api.models;

public class LoginResponse {

    private Boolean success;

    private String failureReason;

    public Boolean isSuccess() { return success; }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
}
