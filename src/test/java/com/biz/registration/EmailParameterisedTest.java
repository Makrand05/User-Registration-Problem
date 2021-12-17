package com.biz.registration;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailParameterisedTest {
    public String emailId;
    public boolean expectedResult;
    public EmailParameterisedTest(String emailId, boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection emailIdsExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@xyz@gmail.com", false},
                {"abc@gmail.com", true},
                {"abc", false},
                {"abc@blz", false},
                {"abc.xyz@blz.com.in", true}
        });
    }

    @Test
    public void givenEmailId_whenEmailIdCorrect_shouldPassAllTestCase() {
        Validation validation = new Validation();
        String actualResult=validation.validateEmail(this.emailId);
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }

}
