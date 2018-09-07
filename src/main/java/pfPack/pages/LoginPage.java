package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LoginPage extends BasePage {
	
	
	@FindBy(id="lid")
	public WebElement EmailField;
	
	@FindBy(id="pwd")
	public WebElement PasswordField;
	
	@FindBy(id="signin_submit")
	public WebElement SignInButton;
	
	//Any other WebElements on Login page
	
	//Constructor code
	public LoginPage(WebDriver driver,ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
		
	}
	
	
	//Reusable methods of Login page
	
	public boolean doLogin() {
		
		EmailField.sendKeys(Constants.USERNAME);
		eTest.log(LogStatus.INFO,"Username got entered into the Email address field on Login page");
		PasswordField.sendKeys(Constants.PASSWORD);
		eTest.log(LogStatus.INFO,"Password got entered successfully");
		SignInButton.click();
		eTest.log(LogStatus.INFO,"SingIn button got clicked");
		
		HomePage homePage = new HomePage(driver,eTest);
		PageFactory.initElements(driver,homePage);
		
		boolean loginStatus = homePage.verifyDisplayOfHomePage();
		
		return loginStatus;
		
	}
	
	//Any other reusable methods
	
	
	

}
