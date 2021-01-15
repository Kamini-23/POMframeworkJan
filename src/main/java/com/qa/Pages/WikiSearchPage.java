package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class WikiSearchPage extends Base {
	
	@FindBy(linkText="Create account")
	WebElement createAccountLink;
	@FindBy(linkText="Main page")
	WebElement MainpageLink;
	@FindBy(linkText="Contact us")
	WebElement Contactus;
	
	public WikiSearchPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	
	}
	
	// Action Method
	public void validatePageTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public void clickOncreateAccount()
	{
		createAccountLink.click();
		  
	}
	
	public void clickOnMainPage()
	{
		MainpageLink.click();
		 
	}
	
	public void clickOnContactus()
	{
		Contactus.click();
		 
	}

}



