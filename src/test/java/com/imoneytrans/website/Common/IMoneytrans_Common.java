package com.imoneytrans.website.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class IMoneytrans_Common {

	public static WebDriver driver;
	
	public final static int defaultsleeptime = 5000; // 3 seconds. 
	
	public final static String user1 ="pluyo@moneytrans.eu"; 
	public final static String pass1 ="test1983!"; 
	
	public final static String user2 ="invaliduser@moneytrans.eu"; 
	public final static String pass2 ="testfail!"; 
	
	public final static String UrlPre = "https://online-pre-tmp.moneytrans.eu/belgium/login/";
	
	public IMoneytrans_Common (WebDriver driver) {
		IMoneytrans_Common.driver = driver;
	}

	public WebDriver ChromeDriverConnetion() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver FireFoxDriverConnetion() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		return driver;
	}

	public static WebElement findElement(By locator) throws InterruptedException {
		return driver.findElement(locator);
	}

	public static List<WebElement> findElements(By locator) throws InterruptedException {
		return driver.findElements(locator);
	}

	public static String getText(WebElement element) throws InterruptedException{
		return element.getText();
	}

	public static String getText(By locator)  throws InterruptedException{
		return driver.findElement(locator).getText();
	}
	
	public static void sendKeys (String inputText, By locator) throws InterruptedException{
		driver.findElement(locator).sendKeys(inputText);
	} 
	
	public static void click (By locator) throws InterruptedException{
		driver.findElement(locator).click();
	}

	public static Boolean isDisplayed(By locator) throws InterruptedException{
		return driver.findElement(locator).isDisplayed();
	}	
	
	public static void SleeperDefault() throws InterruptedException{
		Thread.sleep(defaultsleeptime);
	}	
	
	public static void SleeperSet(int Value) throws InterruptedException{
		Thread.sleep(1000*Value);
	}	
	
	public static void visit (String url) {
		driver.get(url);
	}
}
