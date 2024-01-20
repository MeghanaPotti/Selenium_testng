package OrangeHRM.Tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import OrangeHRM.Utils.WebActions;

public class BaseClass {     //parent class

	public String baseUrl = "https://opensource-demo.orangehrmlive.com/";
	public String userName = "Admin";
	public String password = "admin123";
	public String employeeName = "Keerthi";
	public String userNameUM = "Meghana";
	public String passwordUM = "abc123";
	public String confirmPassword = "abc123";
	
	public static WebDriver driver;  
	public static WebActions app;
	
	@BeforeClass
	public void setUp( ) {
	
		String browser = "chrome";
		if(browser .equals("chrome")) {
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
		}
		
		else if (browser.equals("edge")) {			
		}
		app = new WebActions(driver);
		driver.get(baseUrl);		
  }
    
	@AfterClass
    public void tearDown() {
    	driver.quit();
    }

	 public void captureScreen(String testName) {
		 
		 app.waitForSeconds(2);
		 
	        try {
	            // Convert WebDriver object to TakesScreenshot
	            TakesScreenshot screenshot = (TakesScreenshot) driver;

	            // Capture screenshot as File
	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

	            // Get the current timestamp
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
	            String timestamp = dateFormat.format(new Date());

	            // Define the destination path and file name with the timestamp
	            Path destPath = Paths.get("Screenshots", testName + "_" + timestamp + ".png");

	            // Copy the screenshot to the destination path
	            Files.copy(srcFile.toPath(), destPath);

	            System.out.println("Screenshot captured: " + destPath.toString());
	        } catch (IOException e) {
	            System.err.println("Failed to capture screenshot: " + e.getMessage());
	            
	        }
	    }

}
