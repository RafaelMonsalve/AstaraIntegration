package com.astara.processing.exception;

public enum ErrorCode {

    EX_COR_000("Object fail process");


    private String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
