package com.biz.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String firstName=sc.next();

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
}
