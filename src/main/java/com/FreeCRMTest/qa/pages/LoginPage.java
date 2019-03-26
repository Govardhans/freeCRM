package com.FreeCRMTest.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCRMTest.qa.base.TestBase;

public class LoginPage extends TestBase  {

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="//input(@type='submit')") WebElement loginbtn;
	
	@FindBy(xpath="//img(@class= 'img-responsive')") WebElement logo;
	
	
public LoginPage() throws IOException {
	
	PageFactory.initElements(driver, this);
}

public String validateLoginPageTitle() {
	return driver.getTitle();
	
}
	
	public boolean validateCRMImage() {
		
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pswd) {
		username.sendKeys(un);
		password.sendKeys(pswd);
		loginbtn.click();
		
		return new HomePage();
	
		
	}

}
