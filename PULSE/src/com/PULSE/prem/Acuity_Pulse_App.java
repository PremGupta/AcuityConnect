package com.PULSE.prem;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Acuity_Pulse_App {
	
	static WebDriver driver ;
	
	
	@BeforeTest
	
	public static void setMobileDesiredCapabilitiesForAndroid1()throws Exception {
		// Created object of DesiredCapabilities class.
	DesiredCapabilities capabilities = new DesiredCapabilities();
	// Set android deviceName desired capability. Set it Android Emulator.
	capabilities.setCapability("deviceName", "ZX1D6466VH");
	// Set browserName desired capability. It's Android in our case here.
	capabilities.setCapability("browserName", "");
	// Set android platformVersion desired capability. Set your emulator's android version.
	capabilities.setCapability("platformVersion", "6.0");
	// Set android platformName desired capability. It's Android in our case here.
	capabilities.setCapability("platformName", "Android");
	// Set android appPackage desired capability. It is com.android.calculator2 for calculator application.
	// Set your application's appPackage if you are using any other app.
	capabilities.setCapability("appPackage", "com.android.calculator2");
	// Set android appActivity desired capability. It is com.android.calculator2.Calculator for calculator application.
	// Set your application's appPackage if you are using any other app.
	capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	// Created object of RemoteWebDriver will all set capabilities.
	// Set appium server address and port number in URL string
	// It will launch calculator app in emulator. 
	System.out.println("before done");
	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	System.out.println("app launched");
	// Click on CLR button.
	driver.findElement(By.name("del")).click();
	//OR you can use bellow given syntax to click on CLR/DEL button.
	//driver.findElements(By.className("android.view.View")).get(1).findElements(By.className("android.widget.Button")).get(0).click();
	// Click on number 2 button.
	driver.findElement(By.name("2")).click();
	// Click on + button.
	driver.findElement(By.name("+")).click();
	// Click on number 5 button.
	driver.findElement(By.name("5")).click();
	// Click on = button.
	driver.findElement(By.name("=")).click();
	// Get result from result text box of calc app. 
	String result = driver.findElement(By.className("android.widget.EditText")).getText();
	System.out.println("Number sum result is : " + result);
	//driver.quit(); 
	 }
	}
	
/*	@Test
	public static void setMobileDesiredCapabilitiesForAndroid()throws Exception {
		  pathOfApp = Configuration.appPath;
		  platformName = Configuration.platformName;
		  platformVersion = Configuration.platformVersion;
		  deviceName = Configuration.deviceName;
		  appPackage = Configuration.appPackage;
		  appActivity = Configuration.appActivity;
		  appWaitActivity = Configuration.appWaitActivity;

		System.out.println("Caps starts here");
		  DesiredCapabilities caps = new DesiredCapabilities();
		  System.out.println("Caps object created");
		  caps.setCapability("platformName", "Android");
		  System.out.println("platformName- Android");
		  caps.setCapability("deviceName","ZX1D6466VH" ); // Replace this with your simulator/device version.
		  System.out.println("deviceName- ZX1D6466VH");
		  caps.setCapability("platformVersion", "6.0"); // Replace this with your Android version      
		  System.out.println("platformVersion- 6.0");
		  caps.setCapability("app", "E://Mee//Appium//OLX.apk"); // Replace this with app path in your system
		  System.out.println("app- E://Mee//Appium//OLX.apk");
		  //caps.setCapability("app", app.getAbsolutePath());
		 // System.out.println("Caps starts here");
		  caps.setCapability("appPackage", "com.olx.olx");
		  System.out.println("appPackage- com.olx.olx");
		  caps.setCapability("appActivity", "com.olx.olx.ui.activities.SplashActivity");
		  System.out.println("appActivity- com.olx.olx.ui.activities.SplashActivity");
		  caps.setCapability("appWaitActivity", "com.olx.olx.ui.activities.SplashActivity");
		  System.out.println("appWaitActivity- com.olx.olx.ui.activities.SplashActivity");
		  caps.setCapability("appium-version", "1.4.16.1");
		  System.out.println("appium-version- 1.4.16.1");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  System.out.println("app launched");
		  System.out.println("new URL connected");
	}
}*/

@Test
public static void setMobileDesiredCapabilitiesForAndroid()throws Exception {
	/*  pathOfApp = Configuration.appPath;
	  platformName = Configuration.platformName;
	  platformVersion = Configuration.platformVersion;
	  deviceName = Configuration.deviceName;
	  appPackage = Configuration.appPackage;
	  appActivity = Configuration.appActivity;
	  appWaitActivity = Configuration.appWaitActivity;*/

	System.out.println("Caps starts here");
	  DesiredCapabilities caps = new DesiredCapabilities();
	  System.out.println("Caps object created");
	  caps.setCapability("platformName", "Android");
	  System.out.println("platformName- Android");
	  caps.setCapability("deviceName","ZX1D6466VH" ); // Replace this with your simulator/device version.
	  System.out.println("deviceName- ZX1D6466VH");
	  caps.setCapability("platformVersion", "6.0"); // Replace this with your Android version      
	  System.out.println("platformVersion- 6.0");
	  caps.setCapability("appPackage", "com.olx.olx");
	  System.out.println("appPackage- com.olx.olx");
	  caps.setCapability("appActivity", "com.olx.olx.ui.activities.SplashActivity");
	  System.out.println("appActivity- com.olx.olx.ui.activities.SplashActivity");
	  caps.setCapability("appWaitActivity", "com.olx.olx.ui.activities.SplashActivity");
	  System.out.println("appWaitActivity- com.olx.olx.ui.activities.SplashActivity");
	  caps.setCapability("appium-version", "1.4.16.1");
	  System.out.println("appium-version- 1.4.16.1");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  System.out.println("app launched");
	  System.out.println("new URL connected");
}
}

		/*    String host = "127.0.0.1";
		    String port = "4723";
		    
	  try {
		    	AndroidDriver mDriver = new AndroidDriver(
		                new URL("http://" + host + ":" + port + "/wd/hub"),
		                caps);
		    }
		    catch(Exception e) {
		    	
		    }
		  
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		 }

	@Test
	static void test(){
		driver.findElement(By.id("com.olx.olx:id/start_button")).click();
		driver.findElement(By.id("com.olx.olx:id/country_name")).click(); 
	}
	
}*/

/*import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Acuity_Pulse_App {
	
	static AndroidDriver driver;
	
	public static void main(String arr[]) throws MalformedURLException, InterruptedException 
	{
		File appDir = new File("E:/Mee/");
        File app = new File(appDir, "OLX Free Classifieds_4.35.2_apk-dl.com.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto G(2nd Generation)");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("app", "E:/Mee/OLX Free Classifieds_4.35.2_apk-dl.com.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.quit();
		
		System.out.println("Automation script Started");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		java.util.List<WebElement> mobscr= driver.findElements(By.className("android.widget.TextView"));
		mobscr.get(15).click();
		
	}
}*/


/*import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Acuity_Pulse_App {

		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/Amazon/");
			File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");
		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "Micromax A311");
			capabilities.setCapability("platformVersion", "4.4.2");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.quit();

	}

}*/