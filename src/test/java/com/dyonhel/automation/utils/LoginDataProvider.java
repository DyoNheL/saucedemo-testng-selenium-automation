package com.dyonhel.automation.utils;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"standard_user", "secret_sauce", "success"},
                {"locked_out_user", "secret_sauce", "failure"},
                {"problem_user", "secret_sauce", "success"},
                {"performance_glitch_user", "secret_sauce", "success"},
                {"invalid_user", "invalid_pass", "failure"}
        };
    }

}
