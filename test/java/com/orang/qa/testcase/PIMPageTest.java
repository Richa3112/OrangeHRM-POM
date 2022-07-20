package com.orang.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.DashboardPages;
import com.orange.qa.pages.LoginPages;
import com.orange.qa.pages.PIMPage;

public class PIMPageTest extends TestBase  {
	PIMPage PimPage;
	DashboardPages dashboardPage ;
	LoginPages loginPage;
	//TestUtil testUtil;
	
	
	public PIMPageTest() {
		 super();
	}
		 @BeforeMethod
		 public void setUp() {
			 initialization();
			 PimPage=new PIMPage();	 
			 loginPage =new LoginPages();
			dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			  
		 }
		 
		// @Test
		// public void verifyEmployTest() {
		//Assert.assertTrue(dashboardPage.verifyEmplyeList(),"Employee page is missing");
			 
		// }
			 
			 @BeforeMethod
			 public void TearDown() {
				 driver.quit(); 
	 }
	

}
