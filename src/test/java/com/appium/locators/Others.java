package com.greens.locators;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;

public class Others extends BaseClass{
	
	
	@Test
	public void testName() throws Exception {
		startService();
		
		initializeDriver();
		driver.activateApp("com.swaglabsmobileapp");
		
		WebElement user = driver.findElement(AppiumBy.accessibilityId("test-Username"));
		user.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(AppiumBy.accessibilityId("test-Password"));
		pass.sendKeys("secret_sauce");	
		
		WebElement login = driver.findElement(AppiumBy.accessibilityId("test-LOGIN"));
		login.click();
		
		WebElement add = driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]"));
		boolean displayed = add.isDisplayed();
		
		Assert.assertTrue(displayed);
		
		stopService();
		
	}

}
