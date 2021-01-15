package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	// All test classes are going to inherit this method for opening the browser
	// for opening the url, wait time, max, delete cookies
	// we will use Properties class and methods load() and getProperty()
	
	public Base() 
	{
		prop= new Properties();
		FileInputStream file= null;
		try {
			file = new FileInputStream("C:\\Users\\vishal mittal\\workspace\\POMFrameworkJan\\src\\main\\java\\com\\qa\\Config\\configuration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		// open  browser
	
	String browsername= prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Grid\\geckodriver.exe");
		 	driver = new FirefoxDriver();
		}
		if(browsername.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Grid\\ie.exe");
		 	driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		String urlname= prop.getProperty("url");
		driver.get(urlname);	
		
	}
	

}
