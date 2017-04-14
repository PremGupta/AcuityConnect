
import io.appium.java_client.MobileDriver;
import io.appium.java_client.ScrollsTo;
import io.appium.java_client.TouchAction;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.sun.javafx.tools.ant.Application.Argument;


public class Easy_Social {

static WebDriver driver;


@Test
public static void setMobileDesiredCapabilitiesForAndroid()throws Exception {
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("deviceName", "ZX1D6466VH");
capabilities.setCapability("browserName", "");
capabilities.setCapability("platformVersion", "6.0");
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("appPackage", "com.techjoomla.easysocial");
capabilities.setCapability("appActivity", "com.techjoomla.easysocial.MainActivity");
/*capabilities.setCapability("appPackage", "com.motorola.camera");
capabilities.setCapability("appActivity", "com.motorola.camera.Camera");
*/
 
driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
System.out.println("App Launched");

//1- Registration Flow-
driver.findElement(By.name("Register")).click();
Thread.sleep(2000);

/*List<WebElement> reg=driver.findElements(By.className("android.widget.EditText"));
reg.indexOf(1);*/

driver.findElement(By.name("First name *")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("Divya");
Thread.sleep(2000);
driver.findElement(By.name("Last name *")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Rai");
Thread.sleep(2000);
driver.findElement(By.name("Username *")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//android.widget.EditText[@index='5']")).sendKeys("Divya_Rai");
Thread.sleep(2000);
driver.findElement(By.name("Password *")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//android.widget.EditText[@index='7']")).sendKeys("abcd1234");
Thread.sleep(2000);
//((ScrollsTo<WebElement>) driver).scrollTo("Email *");
//driver.scrollTo("Email *");

/*JavascriptExecutor je=(JavascriptExecutor)driver;
je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.name("Email *")));*/



/*JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0,0)");
do
{
try
{
driver.findElement(By.xpath("//android.widget.EditText[@index='7']")).click();
break;
}
catch(Exception e)
{
js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0, 200)");

}
} while(true);*/

Screen s=new Screen();
s.find("Easy_Social_1.png"); //identify pause button
s.click("Easy_Social_1.png"); //click pause button

System.out.println("pause button clicked");

Thread.sleep(2000);
driver.findElement(By.xpath("//android.view.View[@index='9']")).click();
//driver.findElement(By.name("Email *")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//android.widget.EditText[@index='9']")).sendKeys("divya@gmail.com");
Thread.sleep(2000);

driver.findElement(By.xpath("//android.widget.Spinner[@index='11']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']")).click();
//driver.findElement(By.name("Female")).click();
Thread.sleep(3000);

//driver.findElements("//android.widget.EditText[@index='8']");
//driver.findElement(By.xpath("//input[@id='registarData_email_input']")).sendKeys("Divya_r@techjoomla.com");
//driver.findElement(By.name("email")).sendKeys("Divyar@techjoomlacom");


/*try
{
//driver.findElement(By.name("Email *")).click();
driver.findElement(By.xpath("[@id='registarData_email_input']/ [@name='Email *']")).sendKeys("Divya_r@techjoomla.com");

//driver.findElement(By.id("registarData_email_input")).sendKeys("Divya_r@techjoomla.com");
//driver.findElement(By.name("Email *")).sendKeys("Divya_r@techjoomla.com");
Thread.sleep(5000);
}
catch(Exception e)
{
	e.printStackTrace();
}*/

/*driver.findElement(By.id("registarData_gender_input")).click();
Thread.sleep(4000);*/

/*driver.findElement(By.xpath("android.widget.CheckedTextView[@index='2']")).click();
Thread.sleep(2000);*/
/*driver.findElement(By.id(" From Camera")).click();  Divya_r@techjoomla.com
Thread.sleep(5000);*/

driver.findElement(By.id(" From Gallery")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//android.widget.FrameLayout[@index='1']")).click();
Thread.sleep(5000);

/*capabilities.setCapability("appPackage", "com.motorola.camera");
capabilities.setCapability("appActivity", "com.motorola.camera.Camera");
driver.findElement(By.id("com.motorola.camera:id/main")).click();
Thread.sleep(5000);
driver.findElement(By.id("com.motorola.camera:id/review_approve")).click();
Thread.sleep(5000);*/
//((ScrollsTo<WebElement>) driver).scrollToExact("Birthday");
//((Object) driver).ScrollToExact("Birthday");

/*JavascriptExecutor js = (JavascriptExecutor) driver;
HashMap<String, String> scrollObject = new HashMap<String, String>();
scrollObject.put("direction", "down");
js.executeScript("mobile: scroll", scrollObject);*/


/*//Using Touch Action Classes
	TouchAction tAction=new TouchAction((MobileDriver) driver);
	int startx = driver.findElement(By.name("Password")).getLocation().getX();
	int starty = driver.findElement(By.name("Password")).getLocation().getY();
	int endx = driver.findElement(By.name("Birthday")).getLocation().getX();
	int endy = driver.findElement(By.name("Birthday")).getLocation().getY();
	System.out.println(startx + " ::::::: " + starty + " ::::::: " + endx +  " ::::::: " +	endy);

	//First tap on the screen and swipe it right using moveTo function
	tAction.press(startx+20,starty+20).moveTo(endx+20,endy+20).release().perform(); 
	Thread.sleep(1000);*/

/*for (int i = 0; i < dimensions.getHeight(); i++) {
driver.swipe(0,scrollStart,0,scrollEnd,2000);
if (driver.findElement(By.name("YourText")).size()>0) 
exit;
}*/
	
/*JavascriptExecutor js = (JavascriptExecutor) driver;
HashMap<String, String> scrollObject = new HashMap<String, String>();
scrollObject.put("direction", "down");
scrollObject.put("element", ((RemoteWebElement) element).getId());
js.executeScript("mobile: scroll", scrollObject);*/

/*JavascriptExecutor js = (JavascriptExecutor) driver; 
js.executeScript("window.scrollTo(0,0)"); 
do 
{
try
{
driver.findElement(By.name("Birthday")).click();
break;
}
catch(Exception e)
{
js = (JavascriptExecutor) driver; 
js.executeScript("window.scrollBy(0, 200)");

}
} while(true);*/

driver.findElement(By.name("Birthday")).click();
Thread.sleep(2000);
driver.findElement(By.name("20 March 2016")).click();
Thread.sleep(5000);
driver.findElement(By.name("Set")).click();
Thread.sleep(2000);
driver.findElement(By.name("Register")).click();
Thread.sleep(2000);


//driver.findElement(By.className("android.view.View")).click();
/*driver.findElement(By.name("DEMO SITE")).click();
Thread.sleep(2000);
System.out.println("clicked on demo");*/

/*driver.findElement(By.className("android.widget.Button")).click();
Thread.sleep(5000);
driver.findElement(By.name("Password")).sendKeys("abcd1234");
Thread.sleep(5000);
System.out.println("clicked on password");

driver.findElement(By.className("android.widget.Button")).click();
Thread.sleep(2000);
System.out.println("clicked on Login button");
*/
  }
}
