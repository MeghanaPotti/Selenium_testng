package OrangeHRM.Tests;

import org.testng.annotations.Test;
import OrangeHRM.PageObjects.LoginPage;

public class LoginTest extends BaseClass{

	@Test
	public void loginTest() {
		
		LoginPage object = new LoginPage(driver);
		object.login(userName, password);   //methodCalling
		captureScreen("loginPage");		
		object.validateLogin();
	}		
}
