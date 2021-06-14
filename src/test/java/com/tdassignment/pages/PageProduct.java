package com.tdassignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tdassignment.utilities.Utilities;

public class PageProduct extends PageBase{


	public PageProduct() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(id="productTitle")
	private WebElement productTitle;

	@FindBy(id="buy-now-button")
	private WebElement buyNowButton;


	/**
	 * Below method will click on the Buy Now button
	 * @param none
	 */
	public void clickBuyNow() {
		Utilities.waitToBeClickable(buyNowButton, "Buy Now Button", 20);
		Utilities.javaScriptClick(buyNowButton,"Buy Now Button");
	}

	/**
	 * Below method will validate that Kindle E-Reader product page loaded
	 * @param none
	 */
	public void validateProductPageLoaded() {
		Utilities.waitForElement(productTitle,"Product Title",10);
	}
}
