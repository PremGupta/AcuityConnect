package Acuity;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.PULSE.prem.PULSE;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.webdriven.commands.Click;
import com.thoughtworks.selenium.webdriven.commands.Submit;


public class Pulse_Acuity {
	
	public static WebDriver driver;
	public static Screen scrn;

	
public static void main(String args[]) throws Exception {


	System.out.println("Caps starts here");
	  DesiredCapabilities caps = new DesiredCapabilities();
	  System.out.println("Caps object created");
	  caps.setCapability("platformName", "Android");
	  System.out.println("platformName- Android");
	  /*caps.setCapability("deviceName","ZX1D6466VH" );
	  System.out.println("deviceName- Moto G2");
	  caps.setCapability("platformVersion", "6.0");
	  System.out.println("platformVersion- 6.0");*/
	  
	  /*caps.setCapability("deviceName","0715f74011cf273a" );
	  System.out.println("deviceName- Samsung S6");
	  caps.setCapability("platformVersion", "6.0.1");
	  System.out.println("platformVersion- 6.0.1");*/ 
	  
	  caps.setCapability("deviceName","ZX1D6466VH" );
	  System.out.println("deviceName- Samsung Moto");
	  caps.setCapability("platformVersion", "6.0");
	  System.out.println("platformVersion- 6.0");
	  
	  caps.setCapability("appPackage", "com.compassusa.acuityconnectenterprise");
	  System.out.println("appPackage- com.compassusa.acuityconnectenterprise");
	  caps.setCapability("appActivity", "com.compassusa.acuityconnectenterprise.MainActivity");
	  System.out.println("appActivity- com.compassusa.acuityconnectenterprise.MainActivity");
	  caps.setCapability("appWaitActivity", "com.compassusa.acuityconnectenterprise.MainActivity");
	  System.out.println("appWaitActivity- com.compassusa.acuityconnectenterprise.MainActivity");
	  //caps.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, Wait.DEFAULT_INTERVAL);
	  caps.setCapability("appium-version", "1.4.16.1");
	  System.out.println("appium-version- 1.4.16.1");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	  System.out.println("new URL connected- app launched");
	  System.out.println("=========================================================");
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	 
	  
	   scrn=new Screen();
	  /*Pattern Image1= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image1.png");
	  scrn.click(Image1);
	  Pulse_Acuity.scrnshot();*/
	   
	   Pulse_Acuity.Login();
	   System.out.println("Login flow is done");
	   
	   Pulse_Acuity.Wizard();
	   System.out.println("Wizard flow is done");
	   
	   Pulse_Acuity.Dashboard();
	   System.out.println("Dashboard flow is done");
	   
	   Pulse_Acuity.Location();
	   System.out.println("Location flow is done");
	   
	   Pulse_Acuity.Outbox();
	   System.out.println("Outbox flow is done");
	   
	   Pulse_Acuity.Submitted();
	   System.out.println("Submitted flow is done");
	   
	   Pulse_Acuity.Forms();
	   System.out.println("Forms flow is done");
	   
	   Pulse_Acuity.Assignmnets();
	   System.out.println("Assignments flow is done");
	   
	   Pulse_Acuity.Settings();
	   System.out.println("Settings flow is done");
	   
	   Pulse_Acuity.RoleChange();
	   System.out.println("RoleChange flow is done");

}

/*@Test
public void TLogin() throws InterruptedException, IOException, FindFailed
{
	Pulse_Acuity.Login();
	Pulse_Acuity.Wizard();
}*/
public static void Login() throws InterruptedException, IOException
{
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//android.widget.EditText[@index='0' or @text='Username']")).sendKeys("DaveP01");
	  driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("DaveP01");
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//android.widget.EditText[@index='1' or @text='????????']")).sendKeys("Vending888");
	  driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("DaveP01");

	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//android.widget.Image[@index='0']")).click();
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='LOGIN ' and @index='2']")));
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  

	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='LOGIN ' and @index='2']")).click();
	  //driver.findElement(By.xpath("//*[@id='login-page']/div/div[4]/button")).click();
	  if (!driver.findElement(By.xpath("//android.widget.Button[@content-desc='LOGIN ' and @index='2']")).isEnabled()) {
		  System.out.println("Login Successfully");
	}
	  else {
		System.out.println("Not able to login");
	}
	  Thread.sleep(10000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	 
}


public static void Wizard() throws InterruptedException, IOException, FindFailed
{
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//android.view.View[@content-desc='Eurest']")).click();
	   //driver.findElement(By.xpath("//android.view.View[@index='1']")).click();
	   Thread.sleep(2000);
	   Pulse_Acuity.scrnshot();
	   System.out.println("-----------------------------------");
				  
	   driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
	   Thread.sleep(20000);
		  
	  driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='Select Role'and @index='0']")).click();
	  //driver.findElement(By.xpath("//android.widget.Spinneron[@index='0']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
	  //driver.findElement(By.xpath("//*[@resource-id='android:id/text1']")).click();
	  //
	  //driver.findElement(ById.id("android:id/text1")).click();
	 /* Pattern Image2= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image2.png");
	  scrn.click(Image2);*/
	  Thread.sleep(2000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='NEXT']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//android.view.View[@content-desc='ADD NEW LOCATION']")).click();
	  Thread.sleep(2000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Zip Code (12345)      OR']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Zip Code (12345)      OR']")).sendKeys("07090");
	  Thread.sleep(2000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  
	  driver.findElement(By.xpath("//android.view.View[@content-desc='SEARCH NEW LOCATION']")).click();
	  Thread.sleep(30000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  
	  ((AndroidDriver<WebElement>)driver).scrollToExact("Mike Steinfeld *");
	  Thread.sleep(8000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  
	  //driver.findElement(By.xpath("//android.view.View[@index='0']/android.view.View[@content-desc='ADD NEW LOCATION' and @index='3']")).click();
	  Pattern N1= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N1.png");
	  scrn.click(N1);
	  Thread.sleep(4000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  
	  /*driver.findElement(By.xpath("//android.widget.Spinner[@index='0']")).click();
	  Thread.sleep(2000);
	  Pulse_Acuity.scrnshot();
	  
	  driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();*/
	 /* Pattern Image3= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image3.png");
	  scrn.click(Image3);
	  Pulse_Acuity.scrnshot();
	  Thread.sleep(2000);*/
	  
	  
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='DONE']")).click();
	  Thread.sleep(20000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
}

public static void Dashboard() throws InterruptedException, IOException
{
	 Thread.sleep(2000);
	  System.out.println("Landed on Dashboard");
      
	  ((AndroidDriver<WebElement>)driver).scrollToExact("In-Progress Form");
	  //((AndroidDriver<WebElement>)driver).scrollToExact("LOCATIONS");
	  Thread.sleep(2000);
	  Pulse_Acuity.scrnshot();
	  System.out.println("-----------------------------------");
	  

}

public static void Location() throws InterruptedException, IOException, FindFailed
{
Thread.sleep(2000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


System.out.println("Location Tab Testing Flow  Strated");
driver.findElement(By.xpath("//android.widget.Button[@content-desc='Locations']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

driver.findElement(By.xpath("//android.widget.Image[@content-desc='filter']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='State']")).click();
Thread.sleep(2000);

/*Pattern Image4= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image4.png");
scrn.click(Image4);*/
driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
Thread.sleep(3000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

//driver.findElement(By.xpath("//android.widget.Button[@content-desc='APPLY FILTER' and @index='0']")).click();
Pattern Image6= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image6.png");
scrn.doubleClick(Image6);
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='clear filter']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='ï‹‡']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='State']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*  Pattern Image5= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image5.png");
scrn.click(Image5);*/
driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Button[@content-desc='SEARCH NEW LOCATION' and @index='0']")).click();
Pattern Image7= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image7.png");
Thread.sleep(2000);
scrn.doubleClick(Image7);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
Thread.sleep(4000);

/*((AndroidDriver<WebElement>)driver).scrollToExact("$$$Marshall Gift Shop");
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");
Thread.sleep(30000);*/

driver.findElement(By.xpath("//android.view.View[@content-desc=' Back']")).click();
Thread.sleep(2000);

((AndroidDriver<WebElement>)driver).scrollToExact("Mike Steinfeld *");
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.EditText[@text='Search Locations']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.EditText[@text='Search Locations']")).sendKeys("Mike Steinfeld *");
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='FORMS']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='Daily']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='Job Well Done!']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='-- Select location --']")).click();
Pattern Image9= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image9.png");
scrn.click(Image9);
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*Pattern Image8= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image8.png");
scrn.click(Image8);*/

driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='2']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");



driver.findElement(By.xpath("//android.widget.Image[@content-desc='assignmentsPhone']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='NOMINEE INFORMATION']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*Pattern Image10= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image10.png");
scrn.click(Image10);*/
driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='-- Select Value --' and @index='0']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*  ((AndroidDriver<WebElement>)driver).scrollToExact("$$Meadowbrook Outtakes");
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/

/*Pattern Image11= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image11.png");
scrn.click(Image11);
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/
driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*Pattern Image12= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image12.png");
scrn.click(Image12);*/
driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='-- Select Value --' and @index='0']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*((AndroidDriver<WebElement>)driver).scrollToExact("$$Meadowbrook Outtakes");
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/

/* Pattern Image13= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image13.png");
scrn.click(Image13);
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/
driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*  Pattern Image14= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image14.png");
scrn.click(Image12);
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/

/* ((AndroidDriver<WebElement>)driver).scrollToExact("Other");
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/

/*  Pattern Image15= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image15.png");
scrn.click(Image15);
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/
/*driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
Pulse_Acuity.scrnshot();
Thread.sleep(2000);

driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/

/*driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).click();
driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("Testing");
Pulse_Acuity.scrnshot();
Thread.sleep(2000);

((AndroidDriver<WebElement>)driver).scrollToExact("Next ");
Pulse_Acuity.scrnshot();
Thread.sleep(2000);

driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
Pulse_Acuity.scrnshot();
Thread.sleep(2000);*/

//driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).click();
driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("Testing123");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).click();
Pattern N3= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N3.png");
scrn.click(N3);
driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Testing456");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


/*((AndroidDriver<WebElement>)driver).scrollToExact("Next ");
Pulse_Acuity.scrnshot();
Thread.sleep(4000);*/

//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
Pattern N2= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N2.png");
scrn.click(N2);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
//Pattern N2= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N2.png");
((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


scrn.click(N2);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


System.out.println("Location Tab Testing Flow done");
System.out.println("=================================================================");

//Navigate to Outbox
System.out.println("Check autosync functionality>> Form should not present in outbox-- PASS");
}

public static void Outbox() throws IOException, InterruptedException, FindFailed
{
Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='Outbox']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


}

//Click on Submitted tab

public static void Submitted() throws IOException, InterruptedException, FindFailed
{
System.out.println("Review submitted and synced form in Submitted tab");	
	
Thread.sleep(5000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
Thread.sleep(5000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

	
driver.findElement(By.xpath("//android.widget.Button[@content-desc='Submitted']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='Job Well Done! 1866']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
Pattern N4= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N4.png");
scrn.click(N4);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
scrn.click(N4);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

 
//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
scrn.click(N4);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


((AndroidDriver<WebElement>)driver).scrollToExact("Next ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
scrn.click(N4);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Image[@content-desc='assignmentsPhone']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='GENERAL INFORMATION']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Image[@content-desc='assignmentsPhone']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='USER CONTACT INFORMATION']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


((AndroidDriver<WebElement>)driver).scrollToExact("Next ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
scrn.click(N4);
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");



System.out.println("===============================================================");
}


public static void Forms() throws InterruptedException, IOException, FindFailed
{
driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

	
System.out.println("Forms Tab Testing Flow  Strated");
driver.findElement(By.xpath("//android.widget.Button[@content-desc='Forms']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

driver.findElement(By.xpath("//android.view.View[@content-desc='Trim Trax Weekly (1934)']")).click();
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

Pattern Image9= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\Image9.png");
scrn.click(Image9);
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='2']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Image[@content-desc='assignmentsPhone']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.view.View[@content-desc='Trim Trax Weekly' and @index='0']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='-- Select Value --' and @index='0']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


Pattern N5= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N5.png");
scrn.click(N5);
Thread.sleep(2000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


Thread.sleep(5000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
Thread.sleep(5000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");

	
driver.findElement(By.xpath("//android.widget.Button[@content-desc='Submitted']")).click();
Thread.sleep(4000);
Pulse_Acuity.scrnshot();
System.out.println("-----------------------------------");


System.out.println("==============================================================");

}

public static void Assignmnets() throws InterruptedException, IOException, FindFailed
{
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Assignments']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.ListView[@index='0']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='ï�¿'and @index='0']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.ListView[@index='0']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='-- Select service order --' and @index='0']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	

	driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
	Thread.sleep(6000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	Pattern N6= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N6.png");
	//scrn.click(N6);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='-- Select Value --' and @index='0']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	

	driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	
	scrn.click(N6);
	Thread.sleep(2000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Test");
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	/*driver.findElement(By.xpath("//android.widget.Button[@content-desc='ï�‹Browse File ' and @index='0']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(5000);*/
	
	Pattern N7= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N7.png");
	scrn.click(N7);
	Thread.sleep(2000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='ï„˜ Take Picture ' and @index='1']")).click();
	Pattern N20= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N20.png");
	scrn.click(N20);
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//GLButton[@content-desc='MENUID_SHUTTER' and @text='Shutter']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='OK Button' and @text='OK']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	((AndroidDriver<WebElement>)driver).scrollToExact("Save ");
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
/*	driver.findElement(By.xpath("//android.widget.Image[@content-desc='Z' and @index='8']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Close ï‹—' and @index='0']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//android.widget.Image[@content-desc='Z']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Delete Image' and @index='0']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(5000);*/
	
	Pattern N5= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N5.png");
	scrn.click(N5);
	Thread.sleep(2000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel ']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	

	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Assignments']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.view.View[@content-desc='ïŽ±']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
}


public static void Settings() throws InterruptedException, IOException, FindFailed
{

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Never' and @index='1']")).click();
	Pattern N8= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N8.png");
	scrn.click(N8);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc='Immediate ' and @index='0']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='WIFI Only' and @index='1']")).click();
	Pattern N9= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N9.png");
	scrn.click(N9);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc='Never ' and @index='0']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Re-Sync Data' and @index='0']")).click();
	Thread.sleep(15000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

		
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Submitted']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	System.out.println("Location Tab Testing Flow  Strated");
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Dashboard']")).click();
	Thread.sleep(2000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	Pulse_Acuity.Dashboard();
	Pulse_Acuity.Location();
	Pulse_Acuity.Forms();
	Pulse_Acuity.Assignmnets();
	Pulse_Acuity.Outbox();

	/*Thread.sleep(4000);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Outbox']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Job Well Done! 1866']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
	Pattern N4= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N4.png");
	scrn.click(N4);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
	scrn.click(N4);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
	 
	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
	scrn.click(N4);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	((AndroidDriver<WebElement>)driver).scrollToExact("Next ");
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
	scrn.click(N4);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel ']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//android.widget.Image[@content-desc='assignmentsPhone']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//android.view.View[@content-desc='GENERAL INFORMATION']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//android.widget.Image[@content-desc='assignmentsPhone']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//android.view.View[@content-desc='USER CONTACT INFORMATION']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	((AndroidDriver<WebElement>)driver).scrollToExact("Next ");
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next ']")).click();
	scrn.click(N4);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK ']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
*/

	System.out.println("===============================================================");

}
	
public static void RoleChange() throws InterruptedException, IOException, FindFailed
{
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Chef' and @index='2']")).click();
	Pattern N10= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N10.png");
	scrn.click(N10);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='District Manager' and @index='1']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Assignments']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.view.View[@content-desc='ïŽ±']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='District Manager' and @index='2']")).click();
	Pattern N11= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N11.png");
	scrn.click(N11);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Inspector' and @index='2']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Assignments']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.view.View[@content-desc='ïŽ±']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Inspector' and @index='2']")).click();
	Pattern N12= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N12.png");
	scrn.click(N12);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Unit Manager' and @index='3']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Assignments']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.view.View[@content-desc='ïŽ±']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Unit Manager' and @index='2']")).click();
	Pattern N13= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N13.png");
	scrn.click(N13);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Safety Manager' and @index='4']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Assignments']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	driver.findElement(By.xpath("//android.view.View[@content-desc='ïŽ±']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Eurest' and @index='1']")).click();
	Pattern N14= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N14.png");
	scrn.click(N14);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");

	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Best Vendors, Inc.' and @index='0']")).click();
	Pattern N19= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N19.png");
	scrn.click(N19);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Select Role' and @index='1']")).click();
	Pattern N15= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N15.png");
	scrn.click(N15);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Question and Answers role' and @index='0']")).click();
	Pattern N21= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N21.png");
	scrn.click(N21);
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Thread.sleep(8000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	((AndroidDriver<WebElement>)driver).scrollToExact("Logout");
	Thread.sleep(4000);
	Pattern N22= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N22.png");
	scrn.click(N22);
/*	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Best Vendors, Inc.' and @index='1']")).click();
	Pattern N16= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N16.png");
	scrn.click(N16);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Eurest' and @index='1']")).click();
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Select Role' and @index='1']")).click();
	scrn.click(N15);
	Thread.sleep(4000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Chef' and @index='0']")).click();
	Thread.sleep(10000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='ïˆŽ ']")).click();
	Thread.sleep(5000);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");*/
	
	
	/*driver.findElement(By.xpath("//android.widget.Button[@content-desc='Settings']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Immediate' and @index='1']")).click();
	Pattern N17= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N17.png");
	scrn.click(N17);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='Never' and @index='0']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
	
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Auto Submit Documents' and @index='12']")).click();
	Pattern N18= new Pattern("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse Images\\N18.png");
	scrn.click(N18);
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc='WIFI Only ' and @index='0']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(4000);
	
	Pulse_Acuity.Outbox();
	driver.findElement(By.xpath("//android.view.View[@content-desc='ïŽ±' and @index='0']")).click();
	Pulse_Acuity.scrnshot();
	System.out.println("-----------------------------------");
	Thread.sleep(8000);*/
	
	
	System.out.println("===============================================================");
	
}
public static void scrnshot() throws IOException
{
File srnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String Imagename= "Pulse_Image";
int randomnum= (int) (1000 * Math.random() + (1000-1)+1);
String ImageType=".png";

String RandomImageName= Imagename + randomnum + ImageType;

System.out.println("image name: "); 
System.out.println(RandomImageName);

//FileUtils.copyFile(snapshot, new File("E:\\Mee\\sikuli\\sikuli\\ui_auto.sikuli\\Scrnshts\\"+Randomscreenshotname));
FileUtils.copyFile(srnshot, new File("C:\\Users\\prem.gupta\\Automation_Project\\PULSE\\Pulse_Screenshots\\"+RandomImageName));
System.out.println("screenshot taken");
}
}