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
}
