package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class WikiHomePage extends Base {
	
	
	// Create an Object repository or Page Factory
	
	// WebElement e= driver.findtheelemnt(xpath);
	
	//Step 1: Object Repository  -- @FindBy(locatorname="locatorValue")
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchbox;

	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbutton;
	

	// Step2: Instantiating the Page factory, Object Repository
	
	// Constructor  are just like methods but they have same name as that of Class name
	// to call a method, create object and then use that object to call it
	// but in case of constructors, we dont have call them using objects, as soon as
	// we create an Object of the class, constructor can be called.
	
	public WikiHomePage()   // this is a constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	// Action Methods
	
	//TestCase: Validate is page title,
	//teast case: what is the page URL
	//Testcase: checking if your able to search a string or not
	
		public void validatePageTitle()
		{
			String title = driver.getTitle();
			System.out.println("title of the page is : "+ title);
		}
		
		public void validatePageURL()
		{
			String url = driver.getCurrentUrl();
			System.out.println("url of the page is : "+ url);
		}
		
		public void validatesearchboxAvailbility()
		{
			System.out.println(searchbox.isEnabled());
			System.out.println(searchbox.isDisplayed());
		}
		
		public void validatesearchbuttonAvailbility()
		{
			System.out.println(searchbutton.isEnabled());
			System.out.println(searchbutton.isDisplayed());
		}

		public void searchbox(String searchItem)
		{
			searchbox.clear();
			searchbox.sendKeys(searchItem);
			searchbutton.click();
			 
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
