package com.PULSE.prem;

public class Setup{
	public static void main(String arr[]){
		
@Parameters("Device_ID")
@BeforeMethod
public void setup(String device)throws Exception 
{
	System.out.println(Thread.currentThread().getId());
	switch(device)
	{
	case "085d3b920c928938":
	  capabilities = new DesiredCapabilities();
     //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
      //capabilities.setCapability("browserName", "Chrome");
     capabilities.setCapability(CapabilityType.VERSION, "5.0");
     capabilities.setCapability("deviceName", "hammerhead");
     capabilities.setCapability("platformName", "Android");
     capabilities.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
     capabilities.setCapability("appActivity", "com.davemorrissey.labs.subscaleview.sample.MainActivity");
     break;
	default:System.out.println("nim thatha kottidara ee config du mobile???");
	 		break;
	}
	 driver= new AppiumDriver(new URL("http://localhost:4444/wd/hub"), capabilities); 

     //driver = new AppiumDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
}
@Test
public void zoom() throws MalformedURLException
{ 
	 System.out.println(driver.getSessionId());

     try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
     //android.view.View
     CommonFunctionLibrary cobj=new CommonFunctionLibrary(driver);
     cobj.zoomOnElement(cobj,"id", "com.davemorrissey.labs.subscaleview.sample:id/imageView");
     cobj.pinchOnElement(cobj,"id", "com.davemorrissey.labs.subscaleview.sample:id/imageView");
}
@AfterMethod
public void tearDown()
{
	 driver.quit();
}
	}
}
