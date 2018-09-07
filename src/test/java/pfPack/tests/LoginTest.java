package pfPack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.pages.LaunchPage;
import pfPack.tests.base.BaseTest;
import pfPack.util.Constants;

public class LoginTest extends BaseTest {
	
	@Test
	public void testLogin() {
		
		 eTest = eReport.startTest("LoginTest");
		 
		 eTest.log(LogStatus.INFO,"Login Test has started");
		 
		 openBrowser(Constants.BROWSER_TYPE);
		 
		 LaunchPage launchPage = new LaunchPage(driver,eTest);
		 PageFactory.initElements(driver,launchPage);
		 
		 boolean loginStatus = launchPage.goToLoginPage();
		 
		 if(loginStatus) {
			 
			reportPass("Login test passed");
			 
		 }else {
			 
			 reportFail("Login Test failed");
			 
		 }
		 
	}
	
	@AfterMethod
	public void testClosure() {
		
		if(eReport!=null) {
			
			eReport.endTest(eTest);
			eReport.flush();
			
		}
		
		if(driver!=null) {
			
			driver.quit();
			
		}
		
		
	}
	

}
