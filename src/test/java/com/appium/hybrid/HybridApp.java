package com.greens.hybrid;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.greens.base.BaseClass;

import io.appium.java_client.AppiumBy;

public class HybridApp extends BaseClass {
	
	
	
	@Test
	public void testName() throws Exception {
		
		startService();
		initializeDriver();

		openApp("com.androidsample.generalstore");
		Thread.sleep(6000);
		
		driver.context("NATIVE_APP");
		WebElement name = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
		name.sendKeys("sree");
		
		WebElement logBtn = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
		logBtn.click();
		
		WebElement add = driver.findElement(AppiumBy.xpath("//*[@text='ADD TO CART']"));
		add.click();
		
		WebElement cart = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		cart.click();
		Thread.sleep(3000);
		
		WebElement proceed = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed"));
		proceed.click();
		
		Thread.sleep(3000);
		
		Set<String> contextHandles = driver.getContextHandles();
		System.out.println(contextHandles);
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("SREE RAVINDHAR");
		//search.submit();
		
		stopService();
		
		
	}
	

}
