package com.appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumDemo {

	public static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appiumTest1();
	}

	public static void appiumTest1() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("udid", "08131FDD400474");
		caps.setCapability("appPackage", "com.android.settings");
		caps.setCapability("appActivity", ".Settings");
		
		try {
			
			URL url = new URL("http://127.0.0.1:4723/");
			
			driver = new AppiumDriver<MobileElement>(url, caps);
			
		} catch(MalformedURLException e) {
			
		}
		
	}
}
