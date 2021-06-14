package com.tdassignment.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


import io.cucumber.java.Scenario;

public class Utilities {

	public static ResourceBundle rb = ResourceBundle.getBundle("application");
	public static WebDriver driver;
	public static Scenario scenario;

	public static WebDriver getDriver() {
		String browser= Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", rb.getString("webdriver.chrome.driver"));
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", rb.getString("webdriver.gecko.driver"));
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", rb.getString("webdriver.ie.driver"));
				driver = new InternetExplorerDriver();
			}

		} catch(Exception e) {
			Assert.fail("Invalid Browser: "+browser);
		}
		return driver;
	}


	public static boolean waitForElement(WebElement element, String Description, int time) {
		try {
			new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
			Reporter.log(Description+ " is visible");
			return true;
		} catch(Exception e) {
			Assert.fail(Description+" is not visible");
			return false;
		}
	}

	public static void waitToBeClickable(WebElement element, String Description, int time) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log(Description+ " is clickable");
		} catch(Exception e) {
			Assert.fail(Description+" is not clickable");
		}
	}

	public static void javaScriptClick(WebElement element, String Description) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			Reporter.log(Description+ " is clicked");
			
		} catch(Exception e) {
			Assert.fail(Description+" is not clickable");
		}
	}

	public static void click(WebElement element, String Description) {
		try {
			element.click();
			Reporter.log(Description+ " is clicked");
		} catch(Exception e) {
			Assert.fail(Description+" is not clickable");
		}
	}


	public static byte[] captureScreenshot() throws IOException 
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
	}
}
