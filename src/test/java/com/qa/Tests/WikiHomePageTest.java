package com.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.WikiHomePage;


public class WikiHomePageTest extends Base {

	// With help of TestNG annotations we are going to execute the methods
	// methods are in Page class, so we will call the methods written in page class 
	// execute them with help of testNG annotation
	
	//Step 1:
	// call the constructor from parent class, so as to access the property file
	
	public WikiHomePageTest()
	{
		super();
	}
	
	WikiHomePage hp;
	//  Method for opening browser and url details
	@BeforeMethod
	public void setup()
	{
		initialization();  // start your browser and start the url
		// creating an object for my page class
		hp= new WikiHomePage();
	}
@Test(priority='1')
	
	public void TestValidatePageTitle()
	{
		hp.validatePageTitle();
	}
	

	@Test(priority='2')
	public void testsearchBox()
	{
		String item= prop.getProperty("searchItem");
		hp.searchbox(item);
	}
	
	@Test(priority='3')
	public void testPageUrl()
	{
		hp.validatePageURL();
	}
	@Test(priority='4')
	public void testsearchboxAvail()
	{
		hp.validatesearchboxAvailbility();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
