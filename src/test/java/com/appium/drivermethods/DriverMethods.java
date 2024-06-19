package com.greens.drivermethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.android.AndroidBatteryInfo.BatteryState;
import io.appium.java_client.appmanagement.ApplicationState;

public class DriverMethods extends BaseClass{
	
	@Test
	private void methods() throws IOException {
		
		
		startService();
		initializeDriver();
		
		System.out.println("----Level----");
		
		double level = driver.getBatteryInfo().getLevel();
		System.out.println(level);
		
		System.out.println("----State----");
		
		BatteryState state = driver.getBatteryInfo().getState();
		System.out.println(state);
		
		System.out.println("----isKeyboardShown----");
		
		boolean keyboardShown = driver.isKeyboardShown();
		System.out.println(keyboardShown);
		
		/**
		 * To Hide Keyboard
		 */
		
		driver.hideKeyboard();
		
		/**
		 * To Open Notification pane
		 */
		
		driver.openNotifications();
		
		/**
		 * To Press Back
		 */
		
		driver.navigate().back();
		
		
		/**
		 * To On/Off Location
		 */
		
		driver.toggleLocationServices();
		
		/**
		 * To Lock Device
		 */
		
		//driver.lockDevice();
		
		/**
		 * To Check Lock
		 */
		System.out.println("----deviceLocked----");
		boolean deviceLocked = driver.isDeviceLocked();
		System.out.println(deviceLocked);
		
		/**
		 * To Unlock 
		 */
		
		//driver.unlockDevice();
		
		/**
		 * To get the Clipboard text
		 */
		System.out.println("----clipboardText----");
		
		String clipboardText = driver.getClipboardText();
		System.out.println(clipboardText);
		
		/**
		 * To Set the Clipboard text
		 */
		
		driver.setClipboardText("android Text");
		
		/**
		 * Send or Recieve a File 
		 * 
		 */
		File img = new File("C:\\Users\\Dell\\Downloads\\TestLeaf Logo (13).png");
		driver.pushFile("/sdcard/download/Logo.png",img);
		
	//	byte[] pullFile = driver.pullFile("/sdcard/download/Logo.png");
		
		/**
		 * To Install an App
		 */
		
		driver.installApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		
		/** To Open a App 
		 *  Package - com.swaglabsmobileapp
		 *  Activity - com.swaglabsmobileapp.SplashActivity
		 */
		
		driver.activateApp("com.swaglabsmobileapp");
		/**
		 * Checking State of the Application
		 */
		
		 ApplicationState queryAppState = driver.queryAppState("com.swaglabsmobileapp");
		 System.out.println("------"+queryAppState+"------");
		
		/**
		 * To Run App in Background
		 */
		
		driver.runAppInBackground(Duration.ofSeconds(10));
		
		 ApplicationState queryAppState1 = driver.queryAppState("com.swaglabsmobileapp");
		 System.out.println("------"+queryAppState1+"------");
		
		/**
		 * To Close a App
		 *
		 */
		
		driver.terminateApp("com.swaglabsmobileapp");
		
		 ApplicationState queryAppState2 = driver.queryAppState("com.swaglabsmobileapp");
		 System.out.println("------"+queryAppState2+"------");
		
		/**
		 * Validate App install
		 */
		boolean appInstalled = driver.isAppInstalled("com.swaglabsmobileapp");
		System.out.println(appInstalled);
		
		/**
		 * To Get Capabilities
		 */
		
		Map<String, Object> asMap = driver.getCapabilities().asMap();
		System.out.println(asMap);
		
		Object capability = driver.getCapabilities().getCapability("platformVersion");
		System.out.println(capability);
		
		stopService();
		
		
	}

}
