package com.ra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ra.qa.base.TestBase;
import com.ra.qa.pages.LoginPage;
import com.ra.qa.pages.rates;

public class LoginTest extends TestBase{
	LoginPage loginPage;
	rates Rates;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}

	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		Rates = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		Thread.sleep(5000);
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
