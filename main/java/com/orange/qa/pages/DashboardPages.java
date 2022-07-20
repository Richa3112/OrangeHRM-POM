 package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class DashboardPages extends TestBase{
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/a[1]/img")
	@CacheLookup
	WebElement LogoLabel;
	
	
	@FindBy(xpath="//*[@id=\"welcome\"]")
	WebElement UserNameLable;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIMlink;
	

	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement Leavelink;
	

	@FindBy(id="menu_time_viewTimeModule")
	WebElement Timelink;


	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement Recruitmentlink;

	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[6]/a/b")
	WebElement Myinfolink;

	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[7]/a/b")
	WebElement Performancelink;

	@FindBy(id="menu_dashboard_index")
	WebElement Dashboardlink;


	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[9]/a/b" )
	WebElement Directorylink;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[10]/a/b")
	WebElement Maintaincelink;
	
	
	@FindBy(id="menu_buzz_viewBuzz")
	WebElement Buzzlink;
	
	//admin
	//@FindBy(xpath="//a[@class='arrow']")
	//WebElement userMangagement;
	
	  @FindBy(xpath="//input[@type='button' and @name='btnAdd']")
   	WebElement addButton;

	
	//initiate pageFactory/page object
	public DashboardPages() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String validateDashboardTitle() {
		return driver.getTitle();
	}
	public boolean verifyLogoImg() {
		return LogoLabel.isDisplayed();
	}
	
	public boolean verifycorrectuserName() {
		return UserNameLable.isDisplayed();
	}
	public AdminPage  clickOnAdminLink() {
		AdminLink.click();
		return new AdminPage();
	}
	public PIMPage  clickOnPIMLink() {
		PIMlink.click();
		return new PIMPage();
	}
	public LeavePage clickOnLeaveLink() {
		Leavelink.click();
		return new LeavePage();
	}

	public TimePage clickOnTimeLink() {
		Timelink.click();
		return new TimePage();
	}
	
		public RecruitmentPage clickOnRecruitmentLink() {
			Recruitmentlink.click();
			return new RecruitmentPage();
	}

		public MyInfoPage clickOnMyInfoPageLink() {
		  Myinfolink.click();
			return new MyInfoPage();
	}
		
		public PerformancePage clickOnPerformancePageLink() {
			Performancelink.click();
			return new PerformancePage();
	}
		
		
		public DirectortyPage clickOnDirectortyPageLink() {
			Directorylink.click();
			return new DirectortyPage();
	}
		public MaintenancePage clickOnMaintenancePageLink() {
			Maintaincelink.click();
			return new MaintenancePage();
	}

		public BuzzPage clickOnBuzzPageLink() {
			Buzzlink.click();
			return new BuzzPage();
		
		}
		//Admin
		public void validateAddButton() {
			Actions action=new Actions(driver);
			action.moveToElement(AdminLink).build().perform();
			addButton.click();
			
		}
		
		

}

