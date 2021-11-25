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

	public void CheckAccount() throws InterruptedException{ 
	     LoginPage MethodsfromLoginPage = new LoginPage(driver);

		 MethodsfromLoginPage.fillemail_MR();
		 /*
		 MethodsfromLoginPage.fillemail(); 
		 MethodsfromLoginPage.ClickatContinuarButton();
		 MethodsfromLoginPage.fillpassword(); 
		 MethodsfromLoginPage.ClickatIniciarSesionButton();
		 MethodsfromLoginPage.ClickatProfileIcon();
		 MethodsfromLoginPage.ClickatAccountName();
		 MethodsfromLoginPage.ClickatCuentaOption(); 
		 MethodsfromLoginPage.AssertUserHasDisneySubscription();
		 MethodsfromLoginPage.AssertLink();
	*/
	}

	
	@Test 
	public void CheckStreaming() {
		 
		 LoginPage MethodsfromLoginPage = new LoginPage(driver);
		
		 MethodsfromLoginPage.fillemail_MR();
		/*
		 MethodsfromLoginPage.ClickatContinuarButton();
		 MethodsfromLoginPage.fillpassword(); 
		 MethodsfromLoginPage.ClickatIniciarSesionButton();
		 MethodsfromLoginPage.ClickatProfileIcon();
		 MethodsfromLoginPage.ClickatSelectFalconandWinterSoldierStreaming(); 
		// MethodsfromLoginPage.ClickatVerahora();
	*/
	}

	
	//Test
	//Test
	}
