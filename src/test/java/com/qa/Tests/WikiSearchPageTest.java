package com.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.WikiHomePage;
import com.qa.Pages.WikiSearchPage;

public class WikiSearchPageTest extends Base {
	
	
	public WikiSearchPageTest()
	{
		super();
	}
	
	WikiHomePage hp;
	WikiSearchPage sp;
	@BeforeMethod
	public void setup()
	{
		initialization();
	//	obj= new classname();
		hp= new WikiHomePage();  // assigning class to it
	 sp = new WikiSearchPage();
	 hp.validatePageTitle();   // displayed the title of current page
	 String item=prop.getProperty("searchItem");
	hp.searchbox(item);
	}
	
	@Test(priority='1')
	public void verifywikipageTitle()
	{
	
		sp.validatePageTitle();
		//Assert.assertEquals(wikiPagetitle, "selenium automation - Search results - Wikipedia");
		
	}
	
	@Test(priority='2')
	public void TestCreateAccountLink()
	{
		sp.clickOncreateAccount();
	}
	
	@Test(priority='3')
	public void TestMainPageLink()
	{
		sp.clickOnMainPage();
	}
	
	@Test(priority='4')
	public void TestContactUs()
	{
		sp.clickOnContactus();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	

}
