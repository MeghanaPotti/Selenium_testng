package OrangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import OrangeHRM.Utils.WebActions;

public class AdminUserManagementPage {

public WebDriver localDriver;
private final WebActions app;

	public AdminUserManagementPage(WebDriver driver) {
		localDriver=driver;
	    PageFactory.initElements(driver, this);
	    this.app = new WebActions(driver);
	}
	
	WebElement profileName=localDriver.findElement(By.xpath("//*[@class=\"oxd-userdropdown-tab\"]"));
	WebElement admin = localDriver.findElement(By.xpath("//*[@class='oxd-main-menu-item active']"));
	WebElement userMangement = localDriver.findElement(By.xpath("//*[contains(text(),'User Management ')]"));
	WebElement addButton = localDriver.findElement(By.xpath("//*[@class='orangehrm-header-container']//*[@type='button']"));
	WebElement addUser = localDriver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']"));
	WebElement userRole = localDriver.findElement(By.xpath("//*[contains(text(),'User Role')]"));
	WebElement userRoleDropdown = localDriver.findElement(By.xpath("//*[contains(text(),'User Role')]/parent::div//following-sibling::div"));
//	WebElement adminDropdown = localDriver.findElement(By.xpath(""));
	WebElement employeeName= localDriver.findElement(By.xpath("//*[@placeholder='Type for hints...']"));
	WebElement status = localDriver.findElement(By.xpath("//*[contains(text(),'Status')]"));
	WebElement statusDropDown = localDriver.findElement(By.xpath("//*[contains(text(),'Status')]/parent::div/following-sibling::div"));
//	WebElement enabledDropDown = localDriver.findElement(By.xpath(""));
	WebElement userName = localDriver.findElement(By.xpath("//*[contains(text(),'Username')]/parent::div/following-sibling::div"));
	WebElement password = localDriver.findElement(By.xpath("//*[contains(text(),'Password')]/ancestor::div[contains(@class,'user-password-cell')]//div/following-sibling::div"));
	WebElement confirmPassword = localDriver.findElement(By.xpath("//*[contains(text(),'Confirm Password')]/parent::div/following-sibling::div"));
	WebElement cancel = localDriver.findElement(By.xpath("//*[@type=\'button\']/parent::div[contains(@class,\'oxd-form-actions\')]"));
	WebElement save	 = localDriver.findElement(By.xpath("//*[@type=\'submit\']/parent::div[contains(@class,\'oxd-form-actions\')]"));
	
	public void userManagement(String eName,String uName, String pwd, String cPwd) {
		String profilename=profileName.getText();
		System.out.println("Displayed Profile name is "+profilename);
		String selectedmenu=admin.getText();
		System.out.println("Selected menu is "+selectedmenu);
		String selectedfilter=userMangement.getText();
		System.out.println("Selected filter in Admin is "+selectedfilter);
		employeeName.sendKeys(eName);
		System.out.println("Given Employee name is "+eName);
		userName.sendKeys(uName);
		System.out.println("Given username is "+uName);
		password.sendKeys(pwd);
		System.out.println("Given Password is "+pwd);
		confirmPassword.sendKeys(cPwd);
		System.out.println("Given confirmed password is "+cPwd);
		
	}
		
}
