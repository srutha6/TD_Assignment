package com.tdassignment.steps;

import com.tdassignment.pages.PageLogin;

import io.cucumber.java.en.Then;

public class StepsLogin {

	PageLogin login = new PageLogin();

	@Then("user is asked for email or mobile number")
	public void user_is_asked_for_email_or_mobile_number() {
		login.validatePhoneOrEmailMessage();
	}	

}
