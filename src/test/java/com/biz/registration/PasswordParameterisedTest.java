package com.biz.registration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordParameterisedTest {
   private String password;
   private boolean expectedResult;

    public PasswordParameterisedTest(String password, boolean expectedResult) {
        this.password = password;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection passwordExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"Abc@1234", true},
                {"abc@.com1M", true},
                {"abc@123455", false},
                {"abc@blz", false},
                {"Abc%123p", true}
        });
    }
    @Test
    public void givenPasswords_whenPasswordCorrect_shouldPassAllTestCase() {
        Validation validation = new Validation();
        String actualResult=(validation.validationForPassword(this.password));
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
