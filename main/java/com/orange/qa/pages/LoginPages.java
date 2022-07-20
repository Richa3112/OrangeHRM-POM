 package com.orange.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;


public class LoginPages extends TestBase{

	//pageFactory or(object repojectry)
	@FindBy(id="txtUsername")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;

	@FindBy(name="Submit")
	WebElement Loginbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[1]/img")
	WebElement Logo;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a")
	WebElement ForgetLink;
	
	
	//initiate the pageObject  
	public LoginPages() {
		PageFactory.initElements(driver, this);
	}
		
	//action
		public String  validateLoginPage() {
			return driver.getTitle();
		}
		
		public boolean validateLogo() {
			return Logo.isDisplayed();
		}
		
		public DashboardPages login(String un, String pwd)
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			Loginbtn.click();
			
			return new   DashboardPages();
			
			

		}
		
		
	}
	
	
	


