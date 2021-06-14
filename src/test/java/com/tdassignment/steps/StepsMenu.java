package com.tdassignment.steps;

import com.tdassignment.pages.PageMenu;

import io.cucumber.java.en.And;

public class StepsMenu {

	PageMenu menu = new PageMenu();

	@And("user clicks on the hamburger menu on the top left corner")
	public void user_clicks_on_the_hamburger_menu_on_the_top_left_corner() {
		menu.clickHamburgerMenu();
	}

	@And("Then selects Kindle under Digital Content and Devices")
	public void then_selects_kindle_under_digital_content_and_devices() {
		menu.clickKindleFromMenu();
	}

	@And("Then clicks Kindle under Kindle E-Reader")
	public void then_clicks_kindle_under_kindle_e_reader() {
		menu.clickKindleEReader();
	}


}
