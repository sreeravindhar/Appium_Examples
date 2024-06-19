package com.greens.locators;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;

public class UiSelector extends BaseClass {
	
	
	@Test
	public void testName() throws Exception {
		
		
		startService();
		initializeDriver();
		openApp("io.appium.android.apis");
		
		WebElement views = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));
		views.click();
		
		WebElement visibility = driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Visibility\"));"));
		visibility.click();
		
		
		
	}

}
