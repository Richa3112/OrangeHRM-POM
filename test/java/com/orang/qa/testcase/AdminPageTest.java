package com.orang.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.AdminPage;
import com.orange.qa.pages.DashboardPages;
import com.orange.qa.pages.LoginPages;
import com.orange.qa.util.TestUtil;

public class AdminPageTest extends TestBase{
	AdminPage adminPage;
	DashboardPages dashboardPage ;
	LoginPages loginPage;
	TestUtil testUtil;
	
	String sheetName="AddUser";
	String sheetName1="SearchUser";

	
	public AdminPageTest() {
		 super();
	}
		 @BeforeMethod
		 public void setUp() 
		 {
			 initialization();
			 testUtil= new TestUtil(); 
			 loginPage =new LoginPages();
			dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			adminPage=dashboardPage.clickOnAdminLink();
	     } 
		
		  /* 
		    @DataProvider(name = "getSearchOrangeHRM1")
		    public Object[][] getSearchOrangeHRM() {
	    	Object data[][]=TestUtil.getTestData(sheetName1);
	          return data;
	           }
		    
                @Test(priority=1,dataProvider="getSearchOrangeHRM1")
				public void validateSearchButton(String UsrName,String UserRole,String EmpName, String status) {
				 adminPage.clickSearchButton( UsrName,UserRole, EmpName,status);
			}
               
                @DataProvider(name = "getAddUserOrangeHRM")
    		    
		        public Object[][] getAddUserOrangeHRM() {
		    	Object data[][]=TestUtil.getTestData(sheetName);
		          return data;
		           }
                
		         @Test(priority=2,dataProvider="getAddUserOrangeHRM")
		         public void ValidateAddUser(String UserRole,String EmpName,String UsrName, String status, String password, String confirmPassword )  {
		        	 dashboardPage.validateAddButton();
		        	 adminPage.createAddUsers(UserRole, EmpName, UsrName, status, password, confirmPassword);
			//adminPage.createAddUsers("Admin","Admin A", "Admin", "Disabled", "12345678", "12345678");   //driect pass the value
		         }*/
		         
		         @Test(priority=3)
		         public void validatecheckbox() {
		        	 adminPage.clickOnCheckList();
		        	 
		         }
		         
		/*   @Test(priority=2)
		 public void validateClickOnAddBtn() {
			 dashboardPage.validateAddButton();
		 } */
		 @AfterMethod
		 public void tearDown() {
			driver.quit();

}
}
