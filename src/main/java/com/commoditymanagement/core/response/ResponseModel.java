package com.commoditymanagement.core.response;

public class ResponseModel {

    private String message;

    public ResponseModel() {
    }

    public ResponseModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
