package com.test.hrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","H:\\Automation_setups\\chromedriver\\1\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rajathrm-trials65141.orangehrmlive.com/auth/login");
  }
  
}
