package com.qa.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.WikiCreateAccountPage;
import com.qa.Pages.WikiHomePage;
import com.qa.Pages.WikiSearchPage;



public class WikiCreateAccountPageTest extends Base {
	
	WikiHomePage hp;
	WikiSearchPage sp;
	WikiCreateAccountPage ca;
	
	public WikiCreateAccountPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		hp= new WikiHomePage();
		sp=new WikiSearchPage();
		ca= new WikiCreateAccountPage();
		String item=prop.getProperty("searchItem");
		hp.searchbox(item);
		
		sp.clickOncreateAccount();
	}
	
	//@Test(priority='1',dataProvider="testdataxlsx")
	@Test(priority='1')
	public void TestNewAccountCreate()
	{
	
			ca.createAccountNew();
	
	}

/*	@DataProvider(name="testdataxlsx")
	public Object[][] readExcel() throws EncryptedDocumentException, IOException
	{
	
Object input[] []=com.qa.Utilities.Xls_dataProvider.getTestData("Sheet1");
		
		return input;
		
		
	}*/
	
	@Test(priority='2')
	public void testloginLinkClick()
	{
		ca.loginClick();
	}
	

}
