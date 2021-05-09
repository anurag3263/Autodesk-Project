package com.crm.vtiger.TestScript;

import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtilils.BaseTest;
import com.crm.vtiger.GenericUtilils.FileUtility;
import com.crm.vtiger.GenericUtilils.WebDriverUtility;
import com.crm.vtiger.PomClasses.CreateLeadPage;
import com.crm.vtiger.PomClasses.HomePage;
import com.crm.vtiger.PomClasses.SearchLeadPage;

public class TC_41_searchLeadByClickingOnPhone_Test extends BaseTest {

	/**
	  * @author Anurag
	  * @throws Throwable
	  */
		@Test
		public void creatLead() throws Throwable
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
	        
			CreateLeadPage createleadpage=new CreateLeadPage(driver);
			
			createleadpage.createLeadMethod(firstname, lastname, company, phone, email, website);
			createleadpage.LeadSaveMethod();
			  
		
			   homepage.LeadlistMethod();
			
			 SearchLeadPage searchpage=new SearchLeadPage(driver);
			 searchpage.SearchleadMethod();
			 searchpage.getSearchbarTF().sendKeys("9887744334");
			         webdriverUtility.SelectOption(searchpage.getSearcharDropdown(), "Phone");
			         
			    searchpage.SubmitSearch();
}
}