package com.crm.vtiger.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtilils.WebDriverUtility;

public class HomePage  extends WebDriverUtility {
WebDriver driver;
	
	@FindBy(xpath = "//a[.='Leads']")
	private WebElement leadsListLink;
	
  @FindBy(xpath = "(//input[@type='submit'])[1]\")")
	private WebElement saveBTN;
	

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorIMG;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;



public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getLeadsLink() {
	return leadsListLink;
}


public WebElement getAdminstratorIMG() {
	return adminstratorIMG;
}

public WebElement getSignOutLink() {
	return signOutLink;
}
public void LeadlistMethod() {
	leadsListLink.click();
}

/**
 * Signout from app
 */
public void signOutMethod() {
	mouseOver(driver, adminstratorIMG);
	signOutLink.click();
}

}
