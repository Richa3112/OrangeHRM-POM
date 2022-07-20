 package com.orang.qa.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.AdminPage;
import com.orange.qa.pages.BuzzPage;
import com.orange.qa.pages.DashboardPages;
import com.orange.qa.pages.DirectortyPage;
import com.orange.qa.pages.LeavePage;
import com.orange.qa.pages.LoginPages;
import com.orange.qa.pages.MaintenancePage;
import com.orange.qa.pages.MyInfoPage;
import com.orange.qa.pages.PIMPage;
import com.orange.qa.pages.PerformancePage;
import com.orange.qa.pages.RecruitmentPage;
import com.orange.qa.pages.TimePage;




public class DashboardPageTest extends TestBase{
	LoginPages loginPage;
	DashboardPages dashboardPage ;
	AdminPage adminPage;
	PIMPage pimpage;
	LeavePage leavepage;
	TimePage timepage;
	RecruitmentPage recruitumentpage;
	MyInfoPage myinfoPage;
	PerformancePage performancePage;
	DirectortyPage directortyPage;
	MaintenancePage maintenancePage;
	BuzzPage buzzPage;
	
	public DashboardPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		adminPage= new AdminPage();
		loginPage =new LoginPages();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyDashboardPagesTitle()
	{	
		String DashboardPagesTitle = dashboardPage.validateDashboardTitle();
		Assert.assertEquals(DashboardPagesTitle, "OrangeHRM","Dashboard tittle not match");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
	Assert.assertTrue(dashboardPage.verifycorrectuserName());
	}
	
	@Test(priority=3)
	public void verifyLogoImgTest() {
		Assert.assertTrue(dashboardPage.verifyLogoImg());
		
	}
	
	@Test(priority=4)
	public void verifyAdminLinkTest() {
		adminPage=dashboardPage.clickOnAdminLink();
	}
	
		
	@Test(priority=5)
	public void verifyPIMLinkTest() {
		pimpage=dashboardPage.clickOnPIMLink();
	}
	
	@Test(priority=6)
	public void verifyLeaveLinkTest()
	{
		leavepage = dashboardPage.clickOnLeaveLink();
	}
	
	
	@Test(priority=7)
	public void verifyTimeLinkTest()
	{
		timepage = dashboardPage.clickOnTimeLink();
	}
	
	
	@Test(priority=8)
	public void verifyrecruitumentLinkTest()
	{
		recruitumentpage = dashboardPage.clickOnRecruitmentLink();
	}
		
	
	@Test(priority=9)
	public void verifymyinfoLinkTest()
	{
		myinfoPage = dashboardPage.clickOnMyInfoPageLink();
	}
		
	@Test(priority=10)
	public void verifyperformancePageTest()
	{
		performancePage = dashboardPage.clickOnPerformancePageLink();
	}
	
	
	@Test(priority=11)
	public void verifydirectortyPageTest()
	{
		directortyPage = dashboardPage.clickOnDirectortyPageLink();
	}
	
	@Test(priority=12)
	public void verifymaintenancePageTest()
	{
		maintenancePage = dashboardPage.clickOnMaintenancePageLink();
	
	}
	@Test(priority=13)
	public void verifyBuzzPageTest()
	{
		buzzPage = dashboardPage.clickOnBuzzPageLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}

}
