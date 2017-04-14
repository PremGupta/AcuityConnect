package com.PULSE.prem;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.co.in/");

//Execute A JavaScript Statement On Page
JavascriptExecutor jsx = (JavascriptExecutor) driver;
jsx.executeScript("alert('hi')");

//Take A Screenshot On The Page
File snapshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//Find All Links On The Page
List link = driver.findElements(By.tagName("a"));


//Refresh Page
driver.navigate().refresh();

//Navigate Back And Forward On The Browser
//Go back to the last visited page
driver.navigate().back();

//go forward to the next page
driver.navigate().forward();

//How To Check If An Element Is Visible With WebDriver
WebElement element  = driver.findElement(By.id("element-id"));
if(element instanceof RenderedWebElement) {
System.out.println("Element visible");
} else {
System.out.println("Element Not visible");
}

//Check If An Element Exists
driver.findElements(By.id("element-id")).size()!=0

//Mouseover Action To Make Element Visible Then Click
Actions actions = new Actions(driver);
WebElement menuElement = driver.findElement(By.id("menu-element-id"));
actions.moveToElement(menuElement).moveToElement(driver.findElement(By.xpath("xpath-of-menu-item-element"))).click();


//Switch Between Frames In Java Using Webdriver
WebElement frameElement = driver.findElement(By.id("id-of-frame"));
driver.switchTo().frame(frameElement);

//For Scroll down:
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)", "");
//jse.executeScript("scroll(0, 250);");

//For Scroll up:]
jse.executeScript("window.scrollBy(0,-250)", "");
//jse.executeScript("scroll(0, -250);");

//If you want to scroll for a element then below piece of code will work for you.
jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}

}
