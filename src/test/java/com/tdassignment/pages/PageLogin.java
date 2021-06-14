package com.tdassignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.tdassignment.utilities.Utilities;

public class PageLogin extends PageBase{


	public PageLogin() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(xpath="//*[contains(text(),\"E-mail address or mobile phone number\")]")
	private WebElement phoneOrEmailMessage;


	/**
	 * Below method will verify presence of Phone or Email message
	 * @param none
	 */
	public void validatePhoneOrEmailMessage() {

		if(Utilities.waitForElement(phoneOrEmailMessage,"Phone Or Email Message",20))
			Reporter.log("User is prompted to enter phone or Email");
	}


}
