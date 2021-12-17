package com.biz.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    //validation for the first Name
    // The first name should contain first charter is upper case
    //if the name not contain upper case character in name it is invalid first name
    public String validateFirstName(String firstName) {

        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
                
        if(matcher.matches()){
            return "happy";
        }
        else return "Sad";
    }

    //validation for the Last Name
    // The first name should contain Last charter is upper case
    //if the name not contain upper case character in name it then it is invalid Last name
    public String validateLastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.matches()){
            return "happy";
        }
        else return "Sad";
    }

    //validation for the email id
    // The first name should contain only special charter "@" and "."
    public  String validateEmail(String email) {

        String regex = "^[a-z0-9]{3,}([-._+][a-zA-Z0-9]+)?@[a-z]{2,}.[a-z]{2,3}(.[a-z]{2})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return "happy";
        }
        else return "Sad";
    }

    //validation for the email id
    //Mobile number should contain country code and 10 digit numeric char
    public String validateNumber(String number) {

        String regex = "^[0-9]{2}\\s?[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if(matcher.matches()){
            return "happy";
        }
        else return "Sad";
    }
    //validation for the Password
    // Password should length 8 to 20
    //Password should contain at least 1 upper case
    //Password number should contain at least 1 lowercase case
    //Password number should contain at least 1 special char
//    Password number should contain at least 1 digit

    public String validationForPassword(String password) {

        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*():<>?]).{8,20}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()){
            return "happy";
        }
        else return "Sad";
    }
}
