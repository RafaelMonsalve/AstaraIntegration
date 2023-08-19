package com.astara.processing.exception;

public class ErrorDto {

    private String errorCode;

    private String message;

    private Object errorDetail;

    public ErrorDto() {
    }

    public ErrorDto(String errorCode, String message, Object errorDetail) {
        this.errorCode = errorCode;
        this.message = message;
        this.errorDetail = errorDetail;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(Object errorDetail) {
        this.errorDetail = errorDetail;
    }
}
