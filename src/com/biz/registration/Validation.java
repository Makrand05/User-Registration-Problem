package com.biz.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public void validateFirstName(String firstName) {

        String regex="^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Valid First name");
        }
        else {
            System.out.println("Invalid First Name");
        }
    }

    public void validateLastName(String lastName) {
        String regex="^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(lastName);
        if(matcher.matches()){
            System.out.println("Valid last name");
        }
        else {
            System.out.println("Invalid last Name");
        }
    }

    public void validateEmail(String email) {

        String regex="^[a-z]{3,}?.[a-zA-Z0-9-._+]{1,}@[a-z]{2,}.[a-z]{2,}";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Valid Email Id ");
        }
        else {
            System.out.println("Invalid Email Id ");
        }
    }

    public void validateNumber(String number) {

        String regex="^[0-9]{2}\\s?[0-9]{10}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(number);
        if(matcher.matches()){
            System.out.println("Valid Mobile Number ");
        }
        else {
            System.out.println("Invalid Mobile number ");
        }
    }

    public void validationForPassword(String password) {

        String regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*():<>?]).{8,20}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);

        if(matcher.matches()){
            System.out.println("Valid Password ");
        }
        else {
            System.out.println("Invalid - Password should more that 8 character ");
        }

    }
}
