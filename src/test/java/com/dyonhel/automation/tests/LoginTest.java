package com.dyonhel.automation.tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dyonhel.automation.base.BaseTest;
import com.dyonhel.automation.pages.LoginPage;
import com.dyonhel.automation.utils.LoginDataProvider;

@Epic("SauceDemo Automation")
@Feature("Login Feature")
public class LoginTest extends BaseTest {

	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	@Story("Login using multiple user credentials")
	@Severity(SeverityLevel.CRITICAL)
	public void testLogin(String username, String password, String expectedResult) {

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.login(username, password);

		if (expectedResult.equalsIgnoreCase("success")) {
			Assert.assertTrue(getDriver().getCurrentUrl().contains("inventory"),
					"Expected successful login but failed for user: " + username);
		} else {
			Assert.assertTrue(loginPage.isErrorDisplayed(),
					"Expected error message but login succeeded for user: " + username);
		}
	}
}
