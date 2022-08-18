package com.imoneytrans.website.MobileTopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imoneytrans.website.Common.IMoneytrans_Common;
import com.imoneytrans.website.Login.*;

public class IMoneytrans_TopUp1 extends IMoneytrans_Common{

	static By SendTopUp = By.xpath("//*[@class=\"btn__text\"]");
	static By ButtonTopUpRecharge = By.xpath("//*[(text() = \"Recarga de móvil\" or . = \"Recarga de móvil\")]");
	
	
	public IMoneytrans_TopUp1(WebDriver driver) {
		super(driver);
		 // TODO Auto-generated constructor stub
		}

	public static boolean TopUpRecharge () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
				IMoneytrans_Login1.LogInUser("pluyo@moneytrans.eu","test1983!");
				
				System.out.println("aqui1");
				
   			    if (driver.findElement(ButtonTopUpRecharge).getText().equalsIgnoreCase("Recarga de móvil")) {
   			    	click(ButtonTopUpRecharge);
   			    	wait.until(ExpectedConditions.visibilityOfElementLocated(SendTopUp));
   			    	return true;
   			    }
   			    else {
   			    	System.out.println("aqui3");
   			    	return false;
   			    }
			}	catch (org.openqa.selenium.NoSuchElementException e){
				  System.out.println("No se ha cargado la pagina");
				   return false;
			}
	}
}
