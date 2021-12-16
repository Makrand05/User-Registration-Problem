package com.biz.registration;

import java.util.Scanner;


public class RegistrationClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Validation validation=new Validation();

        System.out.println("Enter First Name : ");
        String firstName=sc.next();
        if (validation.validateFirstName(firstName)) {
            System.out.println("Valid First name");
        } else {
            System.out.println("Invalid First Name");
        }

        System.out.println("Enter last name : ");
        String lastName= sc.next();
        if (validation.validateLastName(lastName)) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last Name");
        }

        System.out.println("Enter email address : ");
        String email= sc.next();
        if (validation.validateEmail(email)) {
            System.out.println("Valid Email Id ");
        } else {
            System.out.println("Invalid Email Id ");
        }

        System.out.println("Enter Mobile number : ");
        String number=  sc.next();
        if ( validation.validateNumber(number)) {
            System.out.println("Valid Mobile Number ");
        } else {
            System.out.println("Invalid Mobile number ");
        }
        System.out.println("Enter Password  : ");
        String password= sc.next();
        if (  validation.validationForPassword(password)) {
            System.out.println("Valid Password ");
        } else {
            System.out.println("Invalid - Password ");
        }


    }
}
