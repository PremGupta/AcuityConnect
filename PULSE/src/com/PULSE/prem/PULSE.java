package com.PULSE.prem;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.ListView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import com.sun.jndi.toolkit.url.Uri;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/*import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;*/


public class PULSE {
	
	static AndroidDriver driver;
	
	public static void main(String arr[]) throws MalformedURLException, InterruptedException 
	{
		
/*	public static void main(String[] args) throws MalformedURLException 
	{
	
		//WebDriver driver= new FirefoxDriver();
		
	 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("app-package", "com.PULSE.prem");
		   // caps.setCapability("browserName", "");
		    caps.setCapability("device", "Android");
		    caps.setCapability("platformName", "Android");
		    caps.setCapability("deviceName", "Android");
		    caps.setCapability("app-activity", "com.myapp.SplashActivity");
		    caps.setCapability("takesScreenshot", true);
		    caps.setCapability("version", "5.0.2");
		    caps.setCapability("device ID", "ZX1D6466VH");
		    //caps.setCapability("app", "E:/Mee/com.android.calculator2-5.1-1720659-22-minAPI22.apk");
		    caps.setCapability("app", "OLX Free Classifieds_4.35.2_apk-dl.com.apk");
		    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub/"), caps);
		    java.util.List<WebElement> calcButtons = driver.findElements(By.xpath("//android.widget.Button"));
		    calcButtons.get(6).click();
	}*/
/*		    using System;
		    using OpenQA.Selenium;
		    using OpenQA.Selenium.Appium;
		    using OpenQA.Selenium.Appium.Interfaces;
		    using OpenQA.Selenium.Appium.MultiTouch;
		    using OpenQA.Selenium.Interactions;
		    using OpenQA.Selenium.Remote;
		    using OpenQA.Selenium.Appium.Android;
		    using OpenQA.Selenium.Appium.iOS;
		    using NUnit.Framework;

		    namespace Hof.Mobile.Tests.UIAutomation
		    {

		        [TestFixture()]
		        public class TestAppium
		        {
		            public static IWebDriver driver = null;

		            [TestFixtureSetUp]
		            public void SetUp()
		            {
		                DesiredCapabilities capabilities = new DesiredCapabilities();

		                capabilities.SetCapability("browserName", "Safari");
		                capabilities.SetCapability("deviceName", "iOS");
		                capabilities.SetCapability("platformName", "ios");
		                capabilities.SetCapability("udid", "<<my udid >>");

		                 driver = new RemoteWebDriver(new Uri("http://127.0.0.1:4723/wd/hub"), capabilities, TimeSpan.FromSeconds(180));
		            }  

		            public void OpenHomePage()
		            {
		                driver.Navigate().GoToUrl("http://url");
		                Console.WriteLine("Page title is : " +driver.Title);
		                //Assert.IsTrue(driver.Title.Equals("test")," Sorry , the website didnt open!!");
		            }

		            public void AssertTitle(string title)
		            {

		                Assert.IsTrue(driver.Title.Equals(title),"Title doesn't match!!");
		            }



		            [TearDown]
		            public void End()
		            {
		                driver.Dispose();
		            }
		        }
		    }*/
		    
		    
	/*public class ContextTest 
	{
	    private AndroidDriver driver;
	    
	    @Before
	    public void setup() throws Exception 
	    {
	        File appDir = new File("D:\\UD\\jars\\");
	        File app = new File(appDir, "WebViewApp.app.zip");
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
//	        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Testing");
	        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    }
	    
	    @After
	    public void tearDown() throws Exception 
	    {
	        driver.quit();
	    }
	    
	    @Test
	    public void testGetContext() 
	    {
	        assertEquals("NATIVE_APP", driver.getContext());
	    }
	    
	    @Test
	    public void testGetContextHandles() 
	    {
	        assertEquals(driver.getContextHandles().size(), 2);
	    }
	    
	    @Test
	    public void testSwitchContext() 
	    {
	        driver.getContextHandles();
	        driver.context("WEBVIEW_1");
	        assertEquals(driver.getContext(), "WEBVIEW_1");
	    }
	    
	    @Test(expected = NoSuchContextException.class)
	    public void testContextError() 
	    {
	        driver.context("Planet of the Ape-ium");
	    }
	}*/
		    
	
	
	//static WebDriver driver;
	
		
	/*	Map<String, String> envMap = System.getenv();
		SortedMap<String, String> sortedEnvMap = new TreeMap<String, String>(envMap);
		Set<String> keySet = sortedEnvMap.keySet();
		for (String key : keySet) {
			String value = envMap.get(key);
			System.out.println("[" + key + "] " + value);
		}
		
		
		 File appDir = new File("E:\\Mee\\");
	        File app = new File(appDir, "OLX Free Classifieds_4.35.2_apk-dl.com.apk");
		
		//File app= new File("E:\\Mee\\OLX Free Classifieds_4.35.2_apk-dl.com.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto G(2nd Generation)");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability("app", "E:\\Mee\\OLX Free Classifieds_4.35.2_apk-dl.com.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		System.out.println("Automation script Started");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		java.util.List<WebElement> mobscr= driver.findElements(By.className("android.widget.TextView"));
		mobscr.get(15).click();
		
		
		
		
		File classpathRoot = new File(System.getProperty("user.dir"));
	    File appDir = new File(classpathRoot, "/Apps/Amazon/");
		File appDir = new File("E:\\Mee\\");
	    File app = new File(appDir, "OLXFreeClassifieds_4.35.2_apk-dl.com.apk/");
	    DesiredCapabilities capability = new DesiredCapabilities();
	    capability.setCapability("autoLaunch", "true");
	    capability.setCapability(CapabilityType.BROWSER_NAME,"");
	    capability.setCapability("automationName", "Appium");
	    capability.setCapability("deviceName", "ZX1D6466VH");
	    capability.setCapability("platformName", "Android");
	    capability.setCapability("platformVersion", "5.0.2");
	    capability.setCapability("app", app.getAbsolutePath());
	   // capability.setCapability("app", "E:\\Mee\\OLX Free Classifieds_4.35.2_apk-dl.com.apk");
	    capability.setCapability("appPackage", "com.olx.olx");
	    //capability.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	    //driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
	}*/
	
	 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "ZX1D6466VH");
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("platformVersion", "5.0.2");
	    desiredCapabilities.setCapability("app", "E:\\Mee\\OLXFreeClassifieds_4.35.2_apk-dl.com.apk");
	    desiredCapabilities.setCapability("appPackage", "com.olx.olx");
	    //desiredCapabilities.setCapability("appActivity", "activityName");

	    String host = "127.0.0.1";
	    String port = "5037";
	    
	    try {
	    	AndroidDriver mDriver = new AndroidDriver(
	                new URL("http://" + host + ":" + port + "/wd/hub"),
	                desiredCapabilities);
	    }
	    catch(Exception e) {
	    	System.out.println(e);	
	   }
	    
	}
}
