package com.biz.registration;

import com.biz.exception.UserRegistrationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {


    /*
     validation for the first Name and Last Name
      The first name should contain first charter is upper case
     if the name not contain upper case character in name it is invalid first name
     */

    public Validation() {
    }


    public IValidation validateFirstName=(firstName) ->{//String validateFirstName(String firstName) throws UserRegistrationException {

        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (!matcher.matches()) {
            throw new UserRegistrationException("  ☹ - Sad - Invalid First Name", UserRegistrationException.ExceptionType.FIRST_NAME_EXCEPTION);
        } else return "happy";
    };
    public IValidation validateLastName=(lastNeme) -> {

        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastNeme);
        if (!matcher.matches()) {
            throw new UserRegistrationException("  ☹ - Sad - Invalid First Name", UserRegistrationException.ExceptionType.LAST_NAME_EXCEPTION);
        } else return "happy";
    };;


    /*
        //validation for the email id
        // The first name should contain only special charter "@" and "."
     */
    public IValidation validateEmail=(email) -> {

        String regex = "^[a-z0-9]{3,}([-._+][a-zA-Z0-9]+)?@[a-z]{2,}.[a-z]{2,3}(.[a-z]{2})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new UserRegistrationException("sad"+" "+UserRegistrationException.ExceptionType.EMAIL_ID_INVALID_EXCEPTION);
        } else return "happy";
    };

    /*
        validation for the email id
        Mobile number should contain country code and 10 digit numeric char
    */
    public IValidation validateNumber=( number)-> {

        String regex = "^([0-9]{2}\\s)?[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (!matcher.matches()) {
           throw new UserRegistrationException("  ☹ - Sad - Invalid First Name", UserRegistrationException.ExceptionType.PHONE_NUMBER_NAME_EXCEPTION);
        } else return "happy";
    };

    /*
    validation for the Password
     Password should length 8 to 20
    Password should contain at least 1 upper case
    Password number should contain at least 1 lowercase case
    Password number should contain at least 1 special char
    Password number should contain at least 1 digit
    */
    public IValidation validationForPassword=( password) -> {

        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*():<>?]).{8,20}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            throw new UserRegistrationException("  ☹ - Sad - Invalid First Name", UserRegistrationException.ExceptionType.PASSWORD_EXCEPTION);
        } else return "happy";
    };




}
