package com.tdassignment.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "features",
		tags= "@test1",
		glue = {"com.tdassignment.steps","com.tdassignment.utilities"},
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","html:target/HtmlReports"},
		monochrome=true,
		publish=true
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
