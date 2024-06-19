package com.greens.serverautomation;

import org.testng.annotations.Test;

import com.greens.base.BaseClass;

public class TestBase extends BaseClass {
	
	
	@Test
	public void testName() throws Exception {
		
		startService();
		initializeDriver();
		driver.installApp("E:\\Mine\\Ecllipse\\AppiumClass\\Apps\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		stopService();
		
		
		
	}

}
