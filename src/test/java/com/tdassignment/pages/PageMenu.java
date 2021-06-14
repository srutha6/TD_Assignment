package com.tdassignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tdassignment.utilities.Utilities;

public class PageMenu extends PageBase{


	public PageMenu() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(id="nav-hamburger-menu")
	private WebElement hamburgerMenu;

	@FindBy(xpath="//*[@id=\"hmenu-content\"]//div[contains(text(),'Kindle')]")
	private WebElement kindleListItem;

	@FindBy(xpath="//*[@id=\"hmenu-content\"]//a[text()='Kindle']")
	private WebElement kindleEReader;

	/**
	 * Below method will click on the hamburger menu
	 * @param none
	 */
	public void clickHamburgerMenu() {
		Utilities.waitToBeClickable(hamburgerMenu,"Hamburger Menu",15);
		Utilities.click(hamburgerMenu,"Hamburger Menu");

	}

	/**
	 * Below method will click on the Kindle link under Digital Content And Devices
	 * @param none
	 */
	public void clickKindleFromMenu() {
		Utilities.waitToBeClickable(kindleListItem,"Kindle List Item",10);
		Utilities.javaScriptClick(kindleListItem,"Kindle List Item");
	}

	/**
	 * Below method will click on the Kindle under Kindle E-Readers
	 * @param none
	 */
	public void clickKindleEReader() {
		Utilities.waitToBeClickable(kindleEReader,"kindle E-Reader",10);
		Utilities.javaScriptClick(kindleEReader,"kindle E-Reader");
	}	
}
