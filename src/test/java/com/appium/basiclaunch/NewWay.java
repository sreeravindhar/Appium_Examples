package com.greens.basiclaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class NewWay {
	
	@Test
	public void meth() throws MalformedURLException {

		// New Way
		UiAutomator2Options op = new UiAutomator2Options();
		op.setDeviceName("Pixel 4 XL API 33");
		op.setPlatformName("Android");
		op.setPlatformVersion("13");
		op.setApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\ApiDemos-debug.apk");
		op.setAutoGrantPermissions(true);
		// Create a Varible to store Appium server adress

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		// Create a session

		AndroidDriver driver = new AndroidDriver(url, op);

	}

}
