package com.biz.registration;

import java.util.Scanner;


public class RegistrationClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Validation validation=new Validation();

//        System.out.println("Enter First Name : ");
//        String firstName=sc.next();
//        validation.validateFirstName(firstName);
//
//        System.out.println("Enter last name : ");
//        String lastName= sc.next();
//        validation.validateLastName(lastName);
//
//        System.out.println("Enter email address : ");
//        String email= sc.next();
//        validation.validateEmail(email);
//
//        System.out.println("Enter Mobile number : ");
//        String number= sc.next();
//        validation.validateNumber(number);
        String password="";
        validation.validationForPassword("maKrjnd5");

    }
}
