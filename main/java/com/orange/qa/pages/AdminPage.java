package com.orange.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orange.qa.base.TestBase;

public class AdminPage extends TestBase{

		//AddButton

	@FindBy(xpath="//a[@class='toggle tiptip']")
	WebElement AdminSystemUsers;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement EmployeName;
	
	@FindBy(id="systemUser_userName")
	WebElement Username;

	@FindBy(xpath="//input[@type='password' and @name='systemUser[password]']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='password' and @name='systemUser[confirmPassword]']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@class='addbutton' and @type='button']")
	WebElement SaveBtn;
	
	
	//SearchBUTTON
	@FindBy(id="searchSystemUser_userName")
	WebElement searchBTN;
	
	@FindBy(xpath="//input[@type='text' and @id='searchSystemUser_userName']")
	WebElement UserName;
	
	@FindBy(xpath="//select[@name='searchSystemUser[userType]' and @id='searchSystemUser_userType']")
	WebElement UserRole;
	
	@FindBy(xpath="//input[@type='text' and @name='searchSystemUser[employeeName][empName]']")
	WebElement EmployeeName;
	
	@FindBy(xpath="//select[@name='searchSystemUser[status]' and @id='searchSystemUser_status']")
	WebElement Status;
	
	//Delete Button and checklist button

	@FindBy(id="ohrmList_chkSelectRecord_18")
	WebElement checklist;
	
	//@FindBy(xpath="//a[text()='71533']//parent::td[@class='left']//input[@name='chkSelectRow[]']")
	//WebElement checklists; 
	
	@FindBy(xpath="//input[@type='button' and @id='dialogDeleteBtn']")
	WebElement dialogDeleteBtn;
	
	
	@FindBy(xpath="//input[@type='submit' and @class='delete' and @id='btnDelete']")
	WebElement DeleteBTN;
	

	//initiate the AdminPage
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	//action

	public void createAddUsers(String UserRole,String EmpName,String UsrName, String status, String password, String confirmPassword )
	{
		
		//Select select= new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		WebElement ele = driver.findElement(By.xpath("//*[@name='systemUser[userType]']"));
		Select select = new Select(ele);
		select.selectByVisibleText(UserRole);
		
		EmployeName.sendKeys(EmpName);
		Username.sendKeys(UsrName);

		WebElement elem = driver.findElement(By.xpath("//*[@name='systemUser[status]']"));
		Select select1 = new Select(elem);
		select1.selectByVisibleText(status);
		
		Password.sendKeys(password);
		ConfirmPassword.sendKeys(confirmPassword);
		SaveBtn.click();
	}
	public void clickSearchButton(String UsrName, String userRole,String employeName,String status) {
		UserName.sendKeys(UsrName);
		UserRole.sendKeys(userRole);
		EmployeeName.sendKeys(employeName);
		Status.sendKeys(status);
		
		Actions action=new Actions(driver);
		action.moveToElement(AdminSystemUsers).build().perform();
		searchBTN.click();
	}
	
	public void clickOnCheckList() {
		checklist.click();	
		Actions action=new Actions(driver);
		action.moveToElement(AdminSystemUsers).build().perform();
		
		DeleteBTN.click();
		//Actions action1=new Actions(driver);
		action.moveToElement(AdminSystemUsers).build().perform();
		dialogDeleteBtn.click();
		action.moveToElement(AdminSystemUsers).build().perform();
		
		}
	
}



			
	
