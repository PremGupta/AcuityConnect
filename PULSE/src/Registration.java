import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class Registration 
		{	
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) throws InterruptedException, IOException 
				{
			AndroidDriver driver = new AndroidDriver(null);
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability("deviceName", "d2f3b458");
					capabilities.setCapability("platformVersion", "5.1.1");
					capabilities.setCapability("platformName", "Android");
					capabilities.setCapability("appPackage", "com.techjoomla.easysocial");
					capabilities.setCapability("appActivity", "com.techjoomla.easysocial.MainActivity");
		 			
	            
	                    driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);    
	                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					driver.findElement(By.xpath("//android.view.View[@content-desc = 'DEMO SITE']")).click();
					driver.findElement(By.xpath("//android.widget.Button[@content-desc = 'Register']")).click();
					
					driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'registarData_name_input')]")).sendKeys("Divya");
					driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'registarData_email_input')]")).sendKeys("divya_r@techjoomla.com");
					driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'registarData_username_input')]")).sendKeys("divya");
					driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'registarData_password_input')]")).sendKeys("abcd1234");
					driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'registarData_password1_input')]")).sendKeys("abcd1234");
					driver.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id, 'registarData_profile_type_input')]")).click();
					driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Business Owners' and @index='3']"));
                    driver.findElement(By.xpath("//android.view.View[@index = '14']")).click();
                    ((AndroidDriver<WebElement>)driver).scrollToExact(" I accept");
					driver.findElement(By.className("android.widget.CheckBox")).click();
					driver.findElement(By.xpath("//android.widget.Button[@content-desc = 'Register']")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.quit();
				
		}
}