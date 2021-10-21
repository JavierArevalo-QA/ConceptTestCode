package org.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.factory.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class MyFirstTestCaseDisneyPlus extends BaseTest { 
	
	

	public MyFirstTestCaseDisneyPlus() {
		// TODO Auto-generated constructor stub
	}

	

	
	
	@Test 

	public void CheckAccount(){ 
	     LoginPage MethodsfromLoginPage = new LoginPage(driver);  	
		 
		 
		 MethodsfromLoginPage.fillemail(); 
		 MethodsfromLoginPage.ClickatContinuarButton();
		 MethodsfromLoginPage.fillpassword(); 
		 MethodsfromLoginPage.ClickatIniciarSesionButton();
		 MethodsfromLoginPage.ClickatProfileIcon();
		 MethodsfromLoginPage.ClickatAccountName();
		 MethodsfromLoginPage.ClickatCuentaOption(); 
		 
	}
	
	@Test 
	public void CheckStreaming() {
		 
		 LoginPage MethodsfromLoginPage = new LoginPage(driver);
		
		 MethodsfromLoginPage.fillemail(); 
		 MethodsfromLoginPage.ClickatContinuarButton();
		 MethodsfromLoginPage.fillpassword(); 
		 MethodsfromLoginPage.ClickatIniciarSesionButton();
		 MethodsfromLoginPage.ClickatProfileIcon();
		 MethodsfromLoginPage.ClickatSelectFalconandWinterSoldierStreaming(); 
		 MethodsfromLoginPage.ClickatVerahora();
	}
	
	//Test
	}
