package org.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager { 
	protected WebDriver driver;
	
	
	@BeforeMethod
	public WebDriver initializeDriver() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.disneyplus.com/es-419/login"); 
		driver.manage().window().maximize(); 
		return driver;
	}

	
	@AfterMethod 
	public void Quitdriver() throws InterruptedException{
	 
		
		
		driver.quit();
		
	}
	
}
