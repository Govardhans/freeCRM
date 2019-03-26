package com.FreeCRMTest.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FreeCRMTest.qa.base.TestBase;
import com.FreeCRMTest.qa.pages.HomePage;
import com.FreeCRMTest.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() throws IOException {
		
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		loginPage= new LoginPage();
	}
	
	@Test(priority= 1)
	public void LoginPageTitleTest() {
		String Title= loginPage.validateLoginPageTitle();
		Assert.assertEquals(Title, "CRMPRO");
	}
	
	@Test(priority= 2)
	public void CRMLogoImageTest() {
		Assert.assertEquals(true, loginPage.validateCRMImage());
	}
	
	@Test(priority= 3)
	public void LoginTest() {
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
