package com.PULSE.prem;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PulseApp {
	
	static WebDriver driver ;

	@org.testng.annotations.Test
public static void setMobileDesiredCapabilitiesForAndroid()throws Exception {


	System.out.println("Caps starts here");
	  DesiredCapabilities caps = new DesiredCapabilities();
	  System.out.println("Caps object created");
	  caps.setCapability("platformName", "Android");
	  System.out.println("platformName- Android");
	  caps.setCapability("deviceName","ZX1D6466VH" ); // Replace this with your simulator/device version.
	  System.out.println("deviceName- ZX1D6466VH");
	  caps.setCapability("platformVersion", "6.0"); // Replace this with your Android version      
	  System.out.println("platformVersion- 6.0");
	  caps.setCapability("appPackage", "com.compass.pulse");
	  System.out.println("appPackage- com.compass.pulse");
	  caps.setCapability("appActivity", "com.compass.pulse.MainActivity");
	  System.out.println("appActivity- com.compass.pulse.MainActivity");
	  //caps.setCapability("appWaitActivity", "com.compass.pulse.MainActivity");
	  //System.out.println("appWaitActivity- com.compass.pulse.MainActivity");
	  caps.setCapability("appWaitActivity", "android.webkit.WebView");
	  System.out.println("appWaitActivity- android.webkit.WebView");
	  caps.setCapability("appium-version", "1.4.16.1");
	  System.out.println("appium-version- 1.4.16.1");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  /*WebDriverWait wait=new WebDriverWait(driver, 120);
	  wait.until(ExpectedConditions.elementToBeSelected(By.className("android.webkit.WebView")));*/
	  System.out.println("app launched");
	  System.out.println("new URL connected");
  }
}