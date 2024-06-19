package com.greens.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;
import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class JavaScriptExample extends BaseClass {
	
	
	
	public static void main(String[] args) {
		
		
		startService();
		initializeDriver();
		installApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\ApiDemos-debug.apk");
		openApp("io.appium.android.apis");
		
		TouchAction tc = new TouchAction(driver);
		
		WebElement views = driver.findElement
				(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));
		views.click();
		
		
		tc.tap(PointOption.point(274, 1369)).perform();
		
		WebElement one = driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
		one.click();
		
		WebElement element = driver.findElement(AppiumBy.xpath("//*[@text='People Names']"));
		
		((JavascriptExecutor)driver)
		.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
		
		driver.navigate().back();
        driver.navigate().back();


        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement drag = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) drag).getId(),
                "endX", 650,
                "endY", 1000
        ));
	}
	
	

}
