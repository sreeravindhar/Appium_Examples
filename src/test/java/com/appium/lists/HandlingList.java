package com.greens.lists;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;

public class HandlingList extends BaseClass {
	
	
	@Test
	public void testName() throws Exception {
		
		
		startService();
		initializeDriver();
		openApp("com.androidsample.generalstore");
		
		WebElement country = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
		country.click();
		
		WebElement selectCountry = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		selectCountry.click();
		
		
		WebElement login = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
		login.click();
		
		WebElement toast = driver.findElement(AppiumBy.xpath("//android.widget.Toast"));
		String attribute = toast.getAttribute("text");
		System.out.println(attribute);
		
		
		WebElement name = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter name here\")"));
		name.sendKeys("sree");
		
		login.click();
		
		stopService();
		
		
		
	}
	
	

}
