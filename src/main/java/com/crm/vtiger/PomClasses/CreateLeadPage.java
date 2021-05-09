package com.crm.vtiger.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtilils.WebDriverUtility;

public class CreateLeadPage extends WebDriverUtility{
WebDriver driver;
	
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLeadLink;

	@FindBy(name = "firstname")
	private WebElement firstnameTF;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTF;
	
	@FindBy(name = "company")
	private WebElement companyanameTF;
	
	@FindBy(id = "phone")
	private WebElement phoneTF;
	
	@FindBy(id = "email")
	private WebElement emailTF;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement websiteTF;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement saveBTN;
	
	public CreateLeadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateLeadLink() {
		return createLeadLink;
	}
   public WebElement getFirstnameTF() {
		return firstnameTF;
	}
	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	public WebElement getCompanyanameTF() {
		return companyanameTF;
	}
	public WebElement getPhoneTF() {
		return phoneTF;
	}
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getWebsiteTF() {
		return websiteTF;
	}
	public WebElement getSaveBTN() {
		return saveBTN;
	}

	public void createLeadMethod(String firstname ,String lastname,String companyname, String phoneNo,String email,String website )
	{
		createLeadLink.click();
		firstnameTF.sendKeys(firstname);
		lastnameTF.sendKeys(lastname);
		companyanameTF.sendKeys(companyname);
		phoneTF.sendKeys(phoneNo);
		emailTF.sendKeys(email);
		websiteTF.sendKeys(website);
		
	}
	public void LeadSaveMethod() {
		saveBTN.click();
	}
}
