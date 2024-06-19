package com.greens.serverautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AutomaticServerLaunch {
	
	
	@Test
	private void one() throws MalformedURLException {
		
		/**
		 * Get the Appium js and Node Path
		 */
		
		File appiumJs =  new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		File nodePath = new File("C:\\Program Files\\nodejs\\node.exe");
		
		AppiumServiceBuilder build = new AppiumServiceBuilder().withAppiumJS(appiumJs)
				.usingDriverExecutable(nodePath)
				.withIPAddress("0.0.0.0")
				.usingPort(4723)
				.withArgument(GeneralServerFlag.BASEPATH,"wd/hub");
				
		AppiumDriverLocalService service = build.build();
		
		service.start();
		
		UiAutomator2Options op = new UiAutomator2Options();
		op.setDeviceName("Pixel 5 API 29");
		op.setPlatformName("Android");
		op.setPlatformVersion("10");
		op.setAvd("Pixel_5_API_29");
		op.setAvdLaunchTimeout(Duration.ofSeconds(50));
		op.setApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\ApiDemos-debug.apk");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,op);

	}
	

}
