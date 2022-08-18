package com.imoneytrans.website.MobileTopUp;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imoneytrans.website.Common.IMoneytrans_Common;
import com.imoneytrans.website.Login.*;


public class IMoneytrans_TopUp2 extends IMoneytrans_Common{

	static By ButtonTopUpRecharge = By.xpath("(//span[@class = \"dashboard__card__title\"])[2]");
   	static By SendTopUP = By.xpath("(//span[@class = \"btn__text\"])[1] ");
    static By SearchRecipient = By.id("inputSearch");
	static By SelectRecipient = By.xpath("//span[text()=\"QA TEST\"]");
	static By ClickNext1 = By.xpath("(//span[@class = \"btn__text\"])[3]");
	static By SelectTopUpAmount = By.xpath("(//div[@class = \"amount-picker__control__entry p-2 ng-star-inserted\"])[1]");
	static By SelectPaymentMethod  = By.xpath("(//div[@class = \"method-picker__control__option\"])[1]");
	static By ClickNext2 = By.xpath("(//span[@class = \"btn__text\"])[2]");	
	static By ClickNext3 = By.xpath("(//span[@class = \"btn__text\"])[2]");	
	static By CardNumber = By.id("cardNumberField");
	static By ExpiryDateyear = By.id("expirydatefield-year");
	static By ExpiryDatemonth = By.id("expirydatefield-month");
	static By cvvfield = By.id("cvvfield");
	static By ConfirmPay = By.id("form_submit");
	static By ClickNext4 = By.xpath("(//a[@class = \"bt-submit\"])[1]");
	static By PaymentSuccessfull = By.xpath("//span[text() = \"Su transferencia se ha completado con éxito.\"]");
	
	public IMoneytrans_TopUp2(WebDriver driver) {
		super(driver);
		 // TODO Auto-generated constructor stub
		}

	public static boolean TopUpRecharge () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
				IMoneytrans_Login1.LogInUser(user1,pass1);
				wait.until(ExpectedConditions.visibilityOfElementLocated(ButtonTopUpRecharge));	
				
   			    if (driver.findElement(ButtonTopUpRecharge).getText().equalsIgnoreCase("Recarga de móvil")) {
   			    	wait.until(ExpectedConditions.elementToBeClickable(ButtonTopUpRecharge));click(ButtonTopUpRecharge);
   			    	wait.until(ExpectedConditions.elementToBeClickable(SendTopUP));click(SendTopUP);
  			    	wait.until(ExpectedConditions.elementToBeClickable(SearchRecipient));click(SearchRecipient);
  			    	SleeperDefault();sendKeys("QA",SearchRecipient);
  			    	SleeperDefault();click(SelectRecipient);
  			    	SleeperDefault();click(ClickNext1);	
  			    	/*SleeperSet(2);click(SelectTopUpAmount);
  			    	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
  			    	SleeperSet(2);click(SelectPaymentMethod);
  			    	SleeperSet(2);click(ClickNext2);
  			    	SleeperSet(2);click(ClickNext3);
  			    	SleeperSet(15);click(CardNumber);
  			    	SleeperSet(1);sendKeys("5017679410000500",CardNumber);
  			    	SleeperSet(1);click(ExpiryDatemonth);
  			    	SleeperSet(1);sendKeys("12",ExpiryDatemonth);
  			    	SleeperSet(1);click(cvvfield);
  			    	SleeperSet(1);sendKeys("123",cvvfield);
  			    	SleeperSet(1);click(ConfirmPay);
  			    	SleeperDefault();click(ClickNext4);
  			    	wait.until(ExpectedConditions.visibilityOfElementLocated(PaymentSuccessfull));click(PaymentSuccessfull);*/
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
