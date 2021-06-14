package com.tdassignment.steps;


import java.io.IOException;

import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.model.Report;
import com.tdassignment.pages.PageBase;
import com.tdassignment.utilities.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class StepsBase {

	PageBase page = new PageBase();

	@Parameters("browser")
	@Before
	public void setUp() {
		page.launchURL();
	}

	@Given("URL is launched")
	public void URL_is_launched() {
		page.verifyCurrentURL();
	}

	@AfterStep
	public void as(Scenario scenario) throws IOException, InterruptedException
	{
		scenario.attach(Utilities.captureScreenshot(), "image/png", "Screenshot");		
	}

	@After
	public void tearDown() {
		page.closeBrowser();
	}

}
