package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class PIMPage extends TestBase{
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement EmployeeList;
	
	//action
	public PIMPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyEmplyeList() {
		return EmployeeList.isDisplayed();
	}
    
	

}
