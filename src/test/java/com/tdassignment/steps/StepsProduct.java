package com.tdassignment.steps;

import com.tdassignment.pages.PageProduct;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsProduct {

	PageProduct product = new PageProduct();


	@When("user clicks on Buy now")
	public void user_clicks_on_buy_now() {
		product.validateProductPageLoaded();
		product.clickBuyNow();
	}	

}
