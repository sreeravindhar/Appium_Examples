package com.greens.actions;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Actions extends BaseClass {

	@Test
	public void testName() throws Exception {

		startService();
		initializeDriver();
		installApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\ApiDemos-debug.apk");
		openApp("io.appium.android.apis");

		// To Perform Touch Action

		TouchAction tc = new TouchAction(driver);

		WebElement views = driver.findElement
				(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));

		// To Tap an Element
		tc.tap(ElementOption.element(views)).perform();

		// To Tap via Point

		tc.tap(PointOption.point(274, 1369)).perform();

		WebElement one = driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
		one.click();

		tc.longPress(PointOption.point(260, 260)).perform();

		// Scroll

		for (int i = 0; i < 3; i++) {
			driver.navigate().back();
		}

		tc.press(PointOption.point(477, 1881))
		.moveTo(PointOption.point(477, 650))
		.release()
		.perform();

		// Drag and Drop

		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		tc.longPress(PointOption.point(220,580))
		.moveTo(PointOption.point(220,1020))
		.release()
		.perform();
		
		
		
		
		
		stopService();

	}

}
