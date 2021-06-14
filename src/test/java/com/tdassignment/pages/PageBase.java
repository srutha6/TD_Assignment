package com.tdassignment.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.tdassignment.utilities.Utilities;

public class PageBase {

	public static ResourceBundle rb = ResourceBundle.getBundle("application");
	public static WebDriver driver;


	public void launchURL() {
		driver = Utilities.getDriver();
		String url = rb.getString("url");
		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log("Launched URL: "+url);
	}


	public void verifyCurrentURL() {
		String url = rb.getString("url");
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, url, "Expected URL: "+url+ " | Actual URL: "+currentURL);
	}



	public void closeBrowser() {
		driver.quit();
		Reporter.log("Closed Browser");
	}


}
