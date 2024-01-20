package OrangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import OrangeHRM.Utils.WebActions;
//import OrangeHRM.Utils.AssertionUtils;

public class LoginPage {
	
	public WebDriver localDriver;
	private final WebActions app;
//	 final AssertionUtils assert;
	
	public LoginPage(WebDriver driver) {
		localDriver=driver;
		PageFactory.initElements(driver, this); 
	 this.app = new WebActions(driver);
//	 this.assert = new AssertionUtils(); 
	}	 //10-16 lines should be same for all page classes	
	//pageElements
//	WebElement userName = localDriver.findElement(By.xpath("//*[@name='username']"));
//	WebElement password = localDriver.findElement(By.xpath("//*[@name='password']"));
//	WebElement loginButton = localDriver.findElement(By.xpath("//*[@type='submit']"));

	By userName = By.xpath("//*[@name='username']");
	By password = By.xpath("//*[@name='password']");
	By loginButton = By.xpath("//*[@type='submit']");
	By dashboardText = By.xpath("//h6[text()='Dashboard']");
//	WebElement element = waitUntilVisible(locator);
//	
//	String userName1 = "//*[@name='username']";
//	WebElement userName2 = localDriver.findElement(By.xpath(userName1));
	
	//pageMethods
	public void login(String uName, String pwd) {    //methodDefinition or methodImplementation
		
		WebActions.waitForPageToLoad(localDriver);
	    app.sendKeys(userName, uName);
		System.out.println("Given username is "+uName);
		app.sendKeys(password, pwd);
		System.out.println("Given password id "+pwd);
		app.click(loginButton);
		System.out.println("Clicked login button");

	}
	
	public void validateLogin() {
		String actualText = app.getText(dashboardText);
		String expectedText = "Dashboard";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login failed, actual text is "+actualText+" but expected text is "+expectedText);
		}
	}
}
