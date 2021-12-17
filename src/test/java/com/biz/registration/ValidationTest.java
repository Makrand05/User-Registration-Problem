package com.biz.registration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidationTest {
    Validation validation;
    @BeforeClass
    public void beforeClass() {
        validation = new Validation();
    }
    //<------------Test Cases for First Name----------------
    @Test
    public void givenFirstNameCase1_whenFirstName_shouldReturnValid() {
        String actualResult=validation.validateFirstName("Makrand");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenFirstNameCase2_whenFirstName_shouldReturnValid() {
        String actualResult=validation.validateFirstName("makrand");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenFirstNameCase3_whenFirstName_shouldReturnValid() {
        String actualResult=validation.validateFirstName("makrand@");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenFirstNameCase4_whenFirstName_shouldReturnValid() {
        String actualResult=validation.validateFirstName("Makrand1");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    //<------------Test Cases for Last Name----------------
    @Test
    public void givenLastNameCase1_whenLastName_shouldReturnValid() {
        String actualResult=validation.validateLastName("Makrand");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenLastNameCase2_whenLastName_shouldReturnValid() {
        String actualResult=validation.validateLastName("makrand");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenLastNameCase3_whenLastName_shouldReturnValid() {
        String actualResult=validation.validateLastName("makrand@");
        
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenLastNameCase4_whenLastName_shouldReturnValid() {
        String actualResult=validation.validateLastName("Makrand1");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }

    //<------------Test Cases for Mobile Number----------------
    @Test
    public void givenMobileNoCase1_whenMobileNoCorrect_shouldReturnValid() {
        String actualResult=validation.validateNumber("919096591234");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMobileNoCase2_whenMobileNoCorrect_shouldReturnValid() {
        String actualResult=validation.validateNumber("91 9096591234");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMobileNoCase3_whenMobileNoCorrect_shouldReturnValid() {
        String actualResult=validation.validateNumber("9096591234");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMobileNoCase4_whenMobileNoCorrect_shouldReturnValid() {
        String actualResult=validation.validateNumber("91909659123");
        String expectedResult="happy";
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
}
