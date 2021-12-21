package com.biz.registration;

import com.biz.exception.UserRegistrationException;

public interface IValidation {
    String iValidation(String value) throws UserRegistrationException;
}
