package com.dyonhel.automation.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.cssSelector("[data-test='error']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Enter username: {0}")
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	@Step("Enter password")
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	@Step("Click Login button")
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	@Step("Perform login")
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}

	public boolean isErrorDisplayed() {
		return driver.findElements(errorMessage).size() > 0;
	}
}
