package com.imoneytrans.website.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imoneytrans.website.Common.IMoneytrans_Common;

/*TEST CASE2
 * Login unsuccessful invalid user
 * USER: invaliduser@moneytrans.eu
 * Password: testfail!
 */
public class IMoneytrans_Login2 extends IMoneytrans_Common{

	static By UserNameLocator = By.xpath("//*[@id=\"email\"]");
	static By PasswodLocator = By.name("password");
	static By ButtonLocator = By.id("loginButton");
	static By InvalidUser = By.xpath("//*[@id=\"error-msg\"]");
	
	
	public IMoneytrans_Login2(WebDriver driver) {
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
					wait.until(ExpectedConditions.visibilityOfElementLocated(InvalidUser));

					//System.out.println(driver.findElement(InvalidUser).getText());
	   			    //System.out.println(driver.findElement(InvalidUser).getText().equalsIgnoreCase("Usuario o password incorrectos."));

	   			    if (driver.findElement(InvalidUser).getText().equalsIgnoreCase("Usuario o password incorrectos.")) {
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
