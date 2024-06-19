package com.greens.locators;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class CC {
	
	public static void main(String[] args) {
		
		File appiumJs =  new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		File nodePath = new File("C:\\Program Files\\nodejs\\node.exe");
		
		AppiumServiceBuilder build = new AppiumServiceBuilder().withAppiumJS(appiumJs)
				.usingDriverExecutable(nodePath)
				.withIPAddress("0.0.0.0")
				.usingPort(4723)
				.withArgument(GeneralServerFlag.BASEPATH,"wd/hub");
				
		AppiumDriverLocalService service = build.build();
		
		service.start();
		
	}

}
