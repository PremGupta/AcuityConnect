package com.PULSE.prem;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testclass {
	
	static WebDriver driver ;
	
	
	@BeforeTest
	public static void setMobileDesiredCapabilitiesForAndroid()throws Exception {
		 /* pathOfApp = Configuration.appPath;
		  platformName = Configuration.platformName;
		  platformVersion = Configuration.platformVersion;
		  deviceName = Configuration.deviceName;
		  appPackage = Configuration.appPackage;
		  appActivity = Configuration.appActivity;
		  appWaitActivity = Configuration.appWaitActivity;*/

		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("platformName", "Android");
		  caps.setCapability("deviceName","ZX1D6466VH" ); // Replace this with your simulator/device version.
		  caps.setCapability("platformVersion", "5.0.2"); // Replace this with your Android version              
		  //caps.setCapability("app", "E://Appium//OLX.apk"); // Replace this with app path in your system
		  caps.setCapability("app", "E://Mee//OLXFreeClassifieds_4.35.2_apk-dl.com.apk");
		  caps.setCapability("appPackage", "com.olx.olx");
		  caps.setCapability("appActivity", "com.olx.olx.ui.activities.SplashActivity");
		  caps.setCapability("appWaitActivity", "com.olx.olx.ui.activities.SplashActivity");
		  //caps.setCapability("appium-version", "1.4.0.0");
		  caps.setCapability("appium-version", "1.4.16.1");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:5554/wd/hub"),caps);
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		 }

	@Test
	static void test(){
		driver.findElement(By.id("com.olx.olx:id/start_button")).click();
		driver.findElement(By.id("com.olx.olx:id/country_name")).click(); 
	}
	
}
