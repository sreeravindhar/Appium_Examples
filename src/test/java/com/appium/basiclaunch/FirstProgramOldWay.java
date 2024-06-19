package com.greens.basiclaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstProgramOldWay {
	
	
	private static void meth() throws MalformedURLException {
	
		
		//OldWay
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.UDID,"DEG6NRGALJFIK77L");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, "E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\General-Store.apk");
		cap.setCapability("autoGrantPermissions", true);
		
		// Create a Varible to store Appium server adress
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		// Create a session
		
		AndroidDriver driver = new AndroidDriver(url,cap);
		
		

	}
	
	public static void main(String[] args) throws MalformedURLException {
		meth();
		
	}
	

}
