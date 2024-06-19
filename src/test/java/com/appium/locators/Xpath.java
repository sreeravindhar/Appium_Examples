package com.greens.locators;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;

public class Xpath extends BaseClass{
	
	
	@Test
	public void testName() throws Exception {
		
		
		startService();
		initializeDriver();
		openApp("io.appium.android.apis");
		
		WebElement views = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		views.click();
		WebElement radioG = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Radio Group\"]"));
		radioG.click();
		
		
		
		
	}

}
