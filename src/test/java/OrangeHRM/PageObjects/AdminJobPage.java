package OrangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import OrangeHRM.Utils.WebActions;

public class AdminJobPage {

	public WebDriver localDriver;
	private  WebActions app;

		public void AdminUserManagementPage(WebDriver driver) {
			localDriver=driver;
		    PageFactory.initElements(driver, this);
		    this.app = new WebActions(driver);
		}
	
	WebElement job = localDriver.findElement(By.xpath("//*[contains(text(),'Job ') and @class='oxd-topbar-body-nav-tab-item']"));
	WebElement jobTitle = localDriver.findElement(By.xpath("//*[contains(text(),'Job Titles')]"));
	WebElement totalRecords = localDriver.findElement(By.xpath("//*[@class=\'oxd-text oxd-text--span\']/parent::div[contains(@class,'orangehrm-horizontal-padding')]"));
//	WebElement 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
