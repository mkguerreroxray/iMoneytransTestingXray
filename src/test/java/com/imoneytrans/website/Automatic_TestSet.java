package com.imoneytrans.website;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.imoneytrans.website.Common.IMoneytrans_Common;
import com.imoneytrans.website.Login.IMoneytrans_Login1;
import com.imoneytrans.website.Login.IMoneytrans_Login2;
import com.imoneytrans.website.MobileTopUp.IMoneytrans_TopUp1;
import com.imoneytrans.website.MobileTopUp.IMoneytrans_TopUp2;

public class Automatic_TestSet { 

	public final static String user1 ="pluyo@moneytrans.eu"; 
	public final static String pass1 ="test1983!"; 
	
	public final static String user2 ="invaliduser@moneytrans.eu"; 
	public final static String pass2 ="testfail!"; 
	
	public final static String UrlPre = "https://online-pre-tmp.moneytrans.eu/belgium/login/";

	IMoneytrans_Login1 IMoneytrans_Login1;  //valid login
	IMoneytrans_Login2 IMoneytrans_Login2;	//invalid login
	
	IMoneytrans_TopUp1 IMoneytrans_TopUp1;  //mobile top-up first look
	IMoneytrans_TopUp2 IMoneytrans_TopUp2;  //mobile top-up execute.  
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		//Begin
	}
	
	/*	
	@SuppressWarnings("static-access")
	@Test
	public void test1() throws InterruptedException {
		IMoneytrans_Login1 = new IMoneytrans_Login1(driver);
		driver = IMoneytrans_Login1.FireFoxDriverConnetion();
		Base.visit(UrlPre);
		assertEquals(true, IMoneytrans_Login1.LogInUser(user1,pass1));
	}
	

	@SuppressWarnings("static-access")
	@Test
	public void test2() throws InterruptedException {
		IMoneytrans_Login2 = new IMoneytrans_Login2(driver);
		driver = IMoneytrans_Login2.FireFoxDriverConnetion();
		Base.visit(UrlPre);
		assertEquals(true, IMoneytrans_Login2.LogInUser(user2,pass2));
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void test3() throws InterruptedException {
		IMoneytrans_TopUp1 = new IMoneytrans_TopUp1(driver);
		driver = IMoneytrans_TopUp1.FireFoxDriverConnetion();
		Base.visit(UrlPre);
		assertEquals(true, IMoneytrans_TopUp1.TopUpRecharge());
	}
	*/
	
	@SuppressWarnings("static-access")
	@Test
	public void test4() throws InterruptedException {
		IMoneytrans_TopUp2 = new IMoneytrans_TopUp2(driver);
		driver = IMoneytrans_TopUp2.FireFoxDriverConnetion();
		IMoneytrans_Common.visit(UrlPre);
		assertEquals(true, IMoneytrans_TopUp2.TopUpRecharge());
	}
	
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}