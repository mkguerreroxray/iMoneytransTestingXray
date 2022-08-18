package com.imoneytrans.website.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imoneytrans.website.Common.IMoneytrans_Common;

/*TEST CASE1
 * Login successful 
 * USER: pluyo@moneytrans.eu
 * Password: test1983!
 */
public class IMoneytrans_Login1 extends IMoneytrans_Common{

	static By UserNameLocator = By.xpath("//*[@id=\"email\"]");
	static By PasswodLocator = By.name("password");
	static By ButtonLocator = By.id("loginButton");
	
	
	static By DashboardOK = By.xpath("//*[(text() = \"Envío de dinero\" or . = \"Envío de dinero\")]");
	
	
	public IMoneytrans_Login1(WebDriver driver) {
	super(driver);
	 // TODO Auto-generated constructor stub
	}

	public static boolean LogInUser (String user, String pass) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
				if(isDisplayed(UserNameLocator)) {
					sendKeys(user, UserNameLocator);
					sendKeys(pass, PasswodLocator);
					click(ButtonLocator);
					wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardOK));

					//System.out.println(driver.findElement(DashboardOK).getText());
	   			    //System.out.println(driver.findElement(DashboardOK).getText().equalsIgnoreCase("Envío de dinero"));

	   			    if (driver.findElement(DashboardOK).getText().equalsIgnoreCase("Envío de dinero")) {
	   			    	return true;
	   			    }
	   			    else {
	   			    	return false;
	   			    }
				}
			}	catch (org.openqa.selenium.NoSuchElementException e){
				  System.out.println("No se ha cargado la pagina");
				  return false;
			}
		
		return true;
	}
	

	public String registredMessage() {
		return "";
	}
	
}
