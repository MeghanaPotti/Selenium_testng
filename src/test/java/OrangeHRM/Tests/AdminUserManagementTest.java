package OrangeHRM.Tests;

import org.testng.annotations.Test;

import OrangeHRM.PageObjects.AdminUserManagementPage;


public class AdminUserManagementTest extends LoginTest {
	
	@Test
	
	public void adminTest() {
		
		AdminUserManagementPage object = new AdminUserManagementPage(driver);
		object.userManagement(employeeName, userNameUM, passwordUM, confirmPassword);
		
		try {
			captureScreen(driver, "AdminPage");
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
