package com.orang.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.DashboardPages;
import com.orange.qa.pages.LoginPages;

public class LoginPageTest extends TestBase {
	LoginPages loginPage;
	DashboardPages dashboardPages;
	
	public LoginPageTest() {
		 super();
	}
		 @BeforeMethod
		 public void setUp() {
			 initialization();
			 loginPage=new LoginPages();	 
	 }
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPage();
		Assert.assertEquals( title, "OrangeHRM", "This Title not match");
		
	}
	@Test(priority=2)
	public void  LogoTest() {
		boolean flag= loginPage.validateLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
		public void loginTest() {
			dashboardPages=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		}
	}



	


