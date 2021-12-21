package com.biz.registration;

import com.biz.exception.UserRegistrationException;

import java.util.Scanner;


public class RegistrationClass {
    public static void main(String[] args) throws UserRegistrationException {
        Scanner sc= new Scanner(System.in);
        Validation validation=new Validation();

        System.out.println("Enter First Name : ");
        String firstName=sc.next();
        if (validation.validateFirstName.iValidation(firstName)=="happy") {
            System.out.println("Invalid First Name");
        } else {
            System.out.println("Valid First name");
        }

        System.out.println("Enter last name : ");
        String lastName= sc.next();
        if (validation.validateLastName(lastName)=="happy") {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last Name");
        }

        System.out.println("Enter email address : ");
        String email= sc.next();
        if (validation.validateEmail(email)=="happy") {
            System.out.println("Valid Email Id ");
        } else {
            System.out.println("Invalid Email Id ");
        }

        System.out.println("Enter Mobile number : ");
        String number=  sc.next();
        if ( validation.validateNumber(number)=="happy") {
            System.out.println("Valid Mobile Number ");
        } else {
            System.out.println("Invalid Mobile number ");
        }
        System.out.println("Enter Password  : ");
        String password= sc.next();
        if (  validation.validationForPassword(password)=="happy") {
            System.out.println("Valid Password ");
        } else {
            System.out.println("Invalid - Password ");
        }

    }
}
