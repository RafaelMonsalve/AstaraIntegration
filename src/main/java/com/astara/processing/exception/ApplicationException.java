package com.astara.processing.exception;

public class ApplicationException extends RuntimeException{
    private ErrorDto error;

    private ErrorClass errorClass;

    public ApplicationException() {
        super();
    }

    public ApplicationException(ErrorDto error, ErrorClass errorClass) {
        this.error = error;
        this.errorClass = errorClass;
    }

    public ErrorDto getError() {
        return error;
    }

    public void setError(ErrorDto error) {
        this.error = error;
    }

    public ErrorClass getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(ErrorClass errorClass) {
        this.errorClass = errorClass;
    }
}
