package OrangeHRM.Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Utilities {
	public void setInputText(WebDriver driver,String xpath,String inputText) {
		driver.findElement(By.xpath(xpath)).sendKeys(inputText);
	}
	public void click(WebDriver driver,String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void softAssert(String actualText, String expectedText) {
		if(actualText.equals(expectedText)) //or String.equals and for int, we use text== 
		{
		Assert.assertTrue(true);
	}
	else {
		System.out.println("actualText is "+actualText + ", expectedText is "+expectedText);
		Assert.assertTrue(false);
	}
	}
	public void softAssert(int actualNumber, int expectedNumber) {
		if(actualNumber==expectedNumber) //or String.equals and for int, we use text== 
		{
		Assert.assertTrue(true);
	}
	else {
		System.out.println("actualNumber is "+actualNumber + ", expectedNumber is "+expectedNumber);
		Assert.assertTrue(false);	
	}
	}
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
}
