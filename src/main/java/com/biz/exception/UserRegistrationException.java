package com.biz.exception;

public class UserRegistrationException extends Exception {

    public ExceptionType exceptionType;
    public String message;

    public enum ExceptionType {
        FIRST_NAME_EXCEPTION, LAST_NAME_EXCEPTION,NULL,PHONE_NUMBER_NAME_EXCEPTION, EMAIL_ID_INVALID_EXCEPTION,
        PASSWORD_EXCEPTION
    }

    public UserRegistrationException(String message, ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
        this.message = message;
    }

    public UserRegistrationException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return  message ;
    }
}
