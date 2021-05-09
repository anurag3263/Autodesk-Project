package com.crm.vtiger.TestScript;

import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtilils.BaseTest;
import com.crm.vtiger.GenericUtilils.FileUtility;
import com.crm.vtiger.GenericUtilils.WebDriverUtility;
import com.crm.vtiger.PomClasses.CreateLeadPage;
import com.crm.vtiger.PomClasses.HomePage;
import com.crm.vtiger.PomClasses.SearchLeadPage;

public class TC_42_searchLeadByClickingOnWebsite_Test extends BaseTest {

	@Test
	public void creatWebsite() throws Throwable
	{
		WebDriverUtility webdriverUtility=new WebDriverUtility();
		
		/**
		 * this method is use to read data from json file
		 */
		  
		FileUtility fUtil=new FileUtility();
		String firstname = fUtil.getDataFromJson("firstname");
		String lastname = fUtil.getDataFromJson("lastname");
		String company = fUtil.getDataFromJson("company");
		String phone = fUtil.getDataFromJson("phone");
		String email = fUtil.getDataFromJson("email");
		String website = fUtil.getDataFromJson("website");
		
		//step-4 : navigating to lead page
		
	HomePage homepage=new HomePage(driver);
	homepage.LeadlistMethod();
	
	CreateLeadPage createlead=new CreateLeadPage(driver);
	createlead.createLeadMethod(firstname, lastname, company, phone, email, website);
	createlead.LeadSaveMethod();
	
	homepage.LeadlistMethod();
	
	SearchLeadPage searchlead=new SearchLeadPage(driver);
	searchlead.SearchleadMethod();
		            
		       searchlead.getSearchbarTF().sendKeys("www.testyantra.com");
		         webdriverUtility.SelectOption(searchlead.getSearcharDropdown(), "Website");
		         
		        searchlead.SubmitSearch();
		         
		       
	}
}
