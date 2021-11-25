package Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.pom.BasePage;
import org.testng.Assert;

public class LoginPage extends BasePage {


	private By Correoelectronico_TextBox = By.name("email");
	/*
	private By Continuar_Button = By.name("dssLoginSubmit");
	private By Contraseña_TextBox = By.id("password");
	private By IniciarSesion_Button = By.name("dssLoginSubmit");
	private By Profile_Icon = By.cssSelector(".sc-eMigcr.sc-chbbiW.JBOOo.profile-avatar");
	private By Account_Name = By.cssSelector(".body-copy.margin--0.sc-kZmsYB.dihOyz.text-color--secondary.margin--left-4");
	private By Account_Option = By.linkText("Cuenta");
	private By SelectFalconandWinterSoldier_Streaming = By.cssSelector(".sc-EHOje.WxEV.basic-card.skipToContentTarget[data-testid='asset-wrapper-2-0']");
	private By VERAHORA_Button = By.cssSelector(".sc-feryYK.sc-jKmXuR.dvEZAn.skipToContentTarget.button");
	private By Subscripcion_Text = By.cssSelector(".sc-hwcHae.sc-cANqwJ.cwJfYp.sc-lhLRcH.eZDFnp[tabindex='0'][data-testid='internal-subscription-d2c-disney_plus_monthly_mx_web_ca95ace']");
	private By OpcionesdePricadidad_Link = By.cssSelector("button[aria-label='Opciones de privacidad']");	
	*/
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void fillemail_MR(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Correoelectronico_TextBox));
		driver.findElement(Correoelectronico_TextBox).sendKeys("test");
	}

	public void fillemail(){  
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Correoelectronico_TextBox));
		driver.findElement(Correoelectronico_TextBox).sendKeys("Taniamelinna_rp19@hotmail.com");
	}
	/*
	public void ClickatContinuarButton(){ 
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Continuar_Button));
	driver.findElement(Continuar_Button).click();
	}

	public void fillpassword(){ 	
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Contraseña_TextBox)); 
		driver.findElement(Contraseña_TextBox).sendKeys("Meli1994236");
	}
	
	public void ClickatIniciarSesionButton(){ 
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(IniciarSesion_Button));
		driver.findElement(IniciarSesion_Button).click();
	}
	
	public void ClickatProfileIcon(){ 
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Profile_Icon)); 
		driver.findElement(Profile_Icon).click(); 
	
	}
	
	public void ClickatAccountName() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Account_Name)); 
		driver.findElement(Account_Name).click(); 
	
	} 
	
	public void ClickatCuentaOption(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Account_Option)); 
		driver.findElement(Account_Option).click(); 
	}
	
	
	public void ClickatSelectFalconandWinterSoldierStreaming(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(SelectFalconandWinterSoldier_Streaming));
		driver.findElement(SelectFalconandWinterSoldier_Streaming).click();
	}
	
	
	public void ClickatVerahora(){ 
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(VERAHORA_Button));
		driver.findElement(VERAHORA_Button).click();
		
	}
	
	public void AssertUserHasDisneySubscription(){ 
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(Subscripcion_Text));
		String SubsctiptionMessage = driver.findElement(Subscripcion_Text).getText(); 
		//System.out.println(SubsctiptionMessage); 
		
	String ExpectedSubscription ="Disney+ (mensual)"; 
	Assert.assertEquals(SubsctiptionMessage, ExpectedSubscription);
	}
	
	public void AssertLink() throws InterruptedException{ 
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(OpcionesdePricadidad_Link));
		driver.findElement(OpcionesdePricadidad_Link).click(); 
		
		try {

		    String winHandleBefore = driver.getWindowHandle();
             int i = 0;
		    for(String winHandle : driver.getWindowHandles()){
		        driver.switchTo().window(winHandle);
		        String act = driver.getCurrentUrl(); 
		          i = i+1; 
		          if(i==2) {
		        String ExpectedURL = "https://privacychoices.thewaltdisneycompany.com/en-US";
			  Assert.assertEquals(ExpectedURL, act);
		          }
		          } 
		   
		    }catch(Exception e){
		   System.out.println("fail");
		    }
		
		Thread.sleep(10000);
		 //String URL = driver.getCurrentUrl(); 
		
		
		// Assert.assertEquals(URL, ExpectedURL);
		//https://www.directv.com.ar/midirectv/ingresar
	}
	//Test
	//Test

	 */
}
