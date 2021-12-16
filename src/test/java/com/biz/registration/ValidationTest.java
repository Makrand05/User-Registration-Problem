package com.biz.registration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest {
   //<------------Test Cases for First Name----------------
    @Test
    public void givenFirstNameCase1_whenFirstName_shouldReturnValid() {

        Assert.assertTrue(Validation.validateFirstName("Makrand"));

    }
    @Test
    public void givenFirstNameCase2_whenFirstName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateFirstName("makrand"));

    }
    @Test
    public void givenFirstNameCase3_whenFirstName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateFirstName("makrand@"));
    }
    @Test
    public void givenFirstNameCase4_whenFirstName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateFirstName("Makrand1"));

    }
    //<------------Test Cases for Last Name----------------
    @Test
    public void givenLastNameCase1_whenLastName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateLastName("Makrand"));
    }
    @Test
    public void givenLastNameCase2_whenLastName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateLastName("makrand"));

    }
    @Test
    public void givenLastNameCase3_whenLastName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateLastName("makrand@"));

    }
    @Test
    public void givenLastNameCase4_whenLastName_shouldReturnValid() {
        Assert.assertTrue(Validation.validateLastName("Makrand1"));
    }
    //<------------Test Cases for Email Id----------------
    @Test
    public void givenEmailIdCase1_whenEmailIdCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateEmail("makrand@gmail.com"));
    }
    @Test
    public void givenEmailIdCase2_whenEmailIdCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateEmail("makrand.123@gmail.com"));
    }
    @Test
    public void givenEmailIdCase3_whenEmailIdCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateEmail("makrand@gmail.com.in"));
    }
    @Test
    public void givenEmailIdCase4_whenEmailIdCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateEmail("mak.rand@gmail.com"));
    }

    //<------------Test Cases for Mobile Number----------------
    @Test
    public void givenMobileNoCase1_whenMobileNoCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateNumber("919096591234"));
    }
    @Test
    public void givenMobileNoCase2_whenMobileNoCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateNumber("91 9096591234"));
    }
    @Test
    public void givenMobileNoCase3_whenMobileNoCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateNumber("9096591234"));
    }
    @Test
    public void givenMobileNoCase4_whenMobileNoCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validateNumber("91909659123"));
    }

    @Test
    public void givenPasswordCase1_whenPasswordCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validationForPassword("Makrand@123"));
    }
    @Test
    public void givenPasswordCase2_whenPasswordCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validationForPassword("makrand@123"));
    }
    @Test
    public void givenPasswordCase3_whenPasswordCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validationForPassword("Makrand123"));
    }
    @Test
    public void givenPasswordCase4_whenPasswordCorrect_shouldReturnValid() {
        Assert.assertTrue(Validation.validationForPassword("Makrand"));
    }
}
