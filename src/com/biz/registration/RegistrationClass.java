package com.biz.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Validation validation=new Validation();

        System.out.println("Enter First Name : ");
        String firstName=sc.next();
        validation.validateFirstName(firstName);

        System.out.println("Enter last name : ");
        String lastName= sc.next();
        validation.validateLastName(lastName);

    }
}
