package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;

public class HomePage extends BasePage {

	
	@FindBy(css="span[class^='zicon-apps-calendar']")
	public WebElement Calender;
	
	@FindBy(css="span[class^='zicon-apps-chat']")
	public WebElement Cliq;
	
	@FindBy(css="span[class^='zicon-apps-crm']")
	public WebElement CRM;
	
	@FindBy(css="span[class^='zicon-apps-mail']")
	public WebElement Mail;
	
	@FindBy(css="span[class^='zicon-apps-salesiq']")
	public WebElement SalesIQ;
	
	//Constructor code
	public HomePage(WebDriver driver,ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
		
	}
	
	//Reusable methods for verifying whether the User got successfully logged in or not
	public boolean verifyDisplayOfHomePage() {
		
		return(isElementPresent(CRM));
		
	}
	
	//Reusable method to navigate to Calender page
	
	//Reusable method to navigate to Cliq page
	
	//Reusable method to navigate to CRM page
	
	//Reusable method to navigate to Mail page
	
	//Reusable method to navigate to SalesIQ page
	
	

}
