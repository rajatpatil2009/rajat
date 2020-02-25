package com.gmail.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverManager
{
	
	public static WebDriver driver= null;

	
	public static void launchBrowser(String browser)
	
	{
		switch(browser)
		{
		case"mozila":
		System.setProperty("webdriver.gecko.driver", "driverpath");
		driver = new FirefoxDriver();
		break;
		
		case"chrome":
		System.setProperty("webdriver.chrome.driver", "driverpath");
		driver = new ChromeDriver();
		break;
		
		case"IE":
		System.setProperty("webdriver.ie.driver", "driverpath");
		driver = new InternetExplorerDriver();
		break;
		
		default:
		System.out.println("driver not found");
		
		}
	}
	
	
	
	
}
