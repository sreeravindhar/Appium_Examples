package com.greens.keyboard;

import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Keyboard extends BaseClass{
	
	@Test
	public void testName() throws Exception {
		
		startService();
		initializeDriver();
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
	}

}
