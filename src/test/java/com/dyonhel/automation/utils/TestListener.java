package com.dyonhel.automation.utils;

import com.dyonhel.automation.base.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Object testClass = result.getInstance();

		if (testClass instanceof BaseTest) {
			BaseTest baseTest = (BaseTest) testClass;
			ScreenshotUtil.captureScreenshot(baseTest.getDriver());
		}
	}
}
