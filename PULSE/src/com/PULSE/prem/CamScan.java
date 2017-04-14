 package com.PULSE.prem;




	import java.io.File;
import java.io.IOException;
import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

	public class CamScan {
		
		public static WebDriver driver ;

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
		  caps.setCapability("appPackage", "com.intsig.camscanner");
		  System.out.println("appPackage- com.intsig.camscanner");
		  caps.setCapability("appActivity", "com.intsig.camscanner.WelcomeActivity");
		  System.out.println("appActivity- com.intsig.camscanner.WelcomeActivity");
		  //caps.setCapability("appWaitActivity", "com.compass.pulse.MainActivity");
		  //System.out.println("appWaitActivity- com.compass.pulse.MainActivity");
		//  caps.setCapability("appWaitActivity", "android.widget.RelativeLayout");
		//  System.out.println("appWaitActivity- android.widget.RelativeLayout");
		  caps.setCapability("appActivity", "com.intsig.camscanner.MainMenuActivity");
		  System.out.println("appActivity- com.intsig.camscanner.MainMenuActivity");
		  caps.setCapability("appWaitActivity", "com.intsig.camscanner.MainMenuActivity");
		  System.out.println("appWaitActivity- com.intsig.camscanner.MainMenuActivity");
	/*	  caps.setCapability("appActivity", "com.intsig.camscanner.MovePageActivity");
		  System.out.println("appActivity- com.intsig.camscanner.MovePageActivity");
		  caps.setCapability("appWaitActivity", "com.intsig.camscanner.MovePageActivity");
		  System.out.println("appWaitActivity- com.intsig.camscanner.MovePageActivity");*/
		  caps.setCapability("appium-version", "1.4.16.1");
		  System.out.println("appium-version- 1.4.16.1");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		  /*WebDriverWait wait=new WebDriverWait(driver, 120);
		  wait.until(ExpectedConditions.elementToBeSelected(By.className("android.webkit.WebView")));*/
		  System.out.println("app launched");
		  System.out.println("new URL connected");
		  
		  getscreenshot();
		  
		  driver.findElement(By.id("com.intsig.camscanner:id/tv_tag_select")).click();
		  Thread.sleep(5000);
		  System.out.println("dropdown clicked");
		
		  getscreenshot();

		  driver.findElement(By.name("Ungrouped(18)")).click();
		  Thread.sleep(2000);
		  
		  getscreenshot();

		  //we can use text value to use by using "by.name"
		  System.out.println("Ungrouped(18) selected");
		 /* driver.findElement(By.id("com.intsig.camscanner:id/btn_tag_item")).click();
		  Thread.sleep(2000);*/
		
		  getscreenshot();
		  
		 driver.findElement(By.name("New Doc 15")).click();
		  Thread.sleep(2000);
		  
		  getscreenshot();

		  System.out.println("New Doc 15 selected");
	/*	driver.findElement(By.id("com.intsig.camscanner:id/dtext")).click();
		  Thread.sleep(2000);*/
		  
		  driver.findElement(By.id("com.intsig.camscanner:id/btn_actionbar_share")).click();
		  Thread.sleep(2000);
		  
		  getscreenshot();

		  driver.findElement(By.name("PDF file (0.33MB)")).click();
		  Thread.sleep(2000);
		  
		  getscreenshot();

		  driver.findElement(By.name("WhatsApp")).click();
		  Thread.sleep(2000);
		  
		  getscreenshot();

		 // ((Object) driver).swipe(165, generateY(((AndroidDriver) driver).scrollTo("Meenu").getLocation()),3000);
		  ((AndroidDriver) driver).scrollTo("Rashmi New");
		  Thread.sleep(2000);
		 /* JavascriptExecutor js=(JavascriptExecutor)driver;
		     js.executeScript("scroll(0,300)");*/

		  driver.findElement(By.name("Rashmi New")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("android:id/button1")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("com.whatsapp:id/entry")).click();
		  Thread.sleep(2000);
		
		  for(int i=0; i<=5;i++)
		  {
		 driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("HI");
		  Thread.sleep(2000);
		  }
	  }

		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));*/
		
		 public static void getscreenshot() throws IOException
		    {
		    File snapshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		    String screenshotname= "Image";
		    String filetype= ".png";
		    int randomnumber= (int) (100 + Math.random() * ((10000 - 1) + 1));
		    String Randomscreenshotname=screenshotname+randomnumber+filetype;

		    System.out.println("Randome image name"); 
		    System.out.println(Randomscreenshotname);
		    
		    FileUtils.copyFile(snapshot, new File("E:\\Mee\\Auto_Screenshot\\"+Randomscreenshotname));
		    System.out.println("screenshot taken");
		    }

		
		private static Object generateY(Point location) {
			// TODO Auto-generated method stub
			return null;
		}
	}