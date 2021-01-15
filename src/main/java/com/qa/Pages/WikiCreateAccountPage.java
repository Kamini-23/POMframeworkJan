package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class WikiCreateAccountPage extends Base {
	
	@FindBy(id="wpName2")
	WebElement username;
	@FindBy(id="wpPassword2")
	WebElement password;
	@FindBy(id="wpRetype")
	WebElement rtype;
	@FindBy(id="wpEmail")
	WebElement em;
	@FindBy(id="wpCreateaccount")
	WebElement button;
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	
	public WikiCreateAccountPage()
	{
		PageFactory.initElements(driver, this); // this means pointing to current class
	
	}

/*	public void createAccountNew(String uName, String Password, String retype, String email) 
	{
		username.sendKeys(uName);
		password.sendKeys(Password);
		rtype.sendKeys(retype);
		em.sendKeys(email);
		
		button.click();
		
	}*/
	
	public void createAccountNew() 
	{
		username.sendKeys("username1");
		password.sendKeys("password1");
		rtype.sendKeys("password1");
		em.sendKeys("password1@123");
		
		button.click();
		
	}
	
	
	
	public void loginClick()
	{
		loginLink.click();
		
	}
	

}
