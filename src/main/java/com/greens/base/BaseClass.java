package com.greens.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass {

	private static AppiumDriverLocalService service;

	public static AndroidDriver driver;

	public static void startService() {
		try {
			String appiumJs = new String(
					"C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
			String nodePath = new String("C:\\Program Files\\nodejs\\node.exe");

			AppiumServiceBuilder build = new AppiumServiceBuilder().withAppiumJS(new File(appiumJs))
					.usingDriverExecutable(new File(nodePath)).withIPAddress("127.0.0.1").usingAnyFreePort()
					.withArgument(GeneralServerFlag.BASEPATH, "wd/hub")
					.withArgument(GeneralServerFlag.ALLOW_INSECURE, "chromedriver_autodownload")
					.withLogFile(new File("AppiumServer.log"));

			service = build.build();

			service.start();
		} catch (AppiumServerHasNotBeenStartedLocallyException e) {
			e.printStackTrace();
		}
	}

	public static void initializeDriver() {

		try {
			URL url = service.getUrl();
			UiAutomator2Options op = new UiAutomator2Options();
			op.setDeviceName("Pixel 5 API 29");
			op.setPlatformName("Android");
			op.setPlatformVersion("13");
			op.setAvd("Pixel_5_API_29");
			op.setAvdLaunchTimeout(Duration.ofSeconds(50));
			op.setCapability("udid", "emulator-5554");
			op.setCapability("browserName", "Chrome");
			driver = new AndroidDriver(url, op);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void stopService() {

		service.stop();
	}

	public static void openApp(String pak) {
		try {
			driver.activateApp(pak);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void installApp(String path) {
		try {
			driver.installApp(path);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
