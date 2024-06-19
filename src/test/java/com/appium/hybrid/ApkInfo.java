package com.greens.hybrid;

import org.openqa.selenium.WebElement;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.touch.offset.ElementOption;

public class ApkInfo extends BaseClass{
	
	public static void main(String[] args) {
		
		
		startService();
		initializeDriver();
		installApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\ApiDemos-debug.apk");
		openApp("io.appium.android.apis");
		WebElement views = driver.findElement
				(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));

		views.click();
	
		
		
	}

}
