package com.smartContactManager.pojo;

import com.smartContactManager.entity_model.UserEntityPojo;

public class ResponsePojo {

    private String status;
    private Integer statusCode;
    private String message;

    private UserEntityPojo userPojo;

    public void setUserModel(UserEntityPojo userPojo) {
        this.userPojo = userPojo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public UserEntityPojo getUserModel() {
        return userPojo;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "status='" + status + '\'' +
                ", statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", userModel=" + userPojo +
                '}';
    }
}
