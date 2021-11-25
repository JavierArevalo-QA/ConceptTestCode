package org.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.selenium.factory.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest { 
	protected WebDriver driver; 
	
	@BeforeMethod 
	
	public void startDriver() { 
		driver = new DriverManager().initializeDriver();
		
	}
	
	@AfterMethod 
	public void quitDriver() throws InterruptedException { 
		Thread.sleep(5000);
		driver.quit();
	}
     //Test
}
