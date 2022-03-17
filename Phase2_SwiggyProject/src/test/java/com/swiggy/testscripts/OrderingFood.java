package com.swiggy.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mongodb.Mongo.Holder;
import com.swiggy.pages.CheckOutPage;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.MainPage;
import com.swiggy.pages.RestaurantsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderingFood extends Driver {
//	private WebDriver driver;

	
	@Given("A User is On Landing Page of Swiggy")
	public void a_user_is_on_landing_page_of_swiggy() {
		 Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}

	@When("he click on link text Eluru")
	public void he_click_on_link_text_eluru() {
	    landingPage.clickEluru();
	}

	@When("it will display main page")
	public void it_will_display_main_page() {
	    mainpage.clickLoc();
	    mainpage.searchLocation();
	}

	@When("user click location tab and pass {string} it will display all the restaurants in Eluru")
	public void user_click_location_tab_and_pass_it_will_display_all_the_restaurants_in_eluru(String string) {
		mainpage.enterLocation(string);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Eluru Not Found");
		}
		
		mainpage.clickEluru();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on Search icon and pass {string} and search")
	public void user_clicks_on_search_icon_and_pass_and_search(String string) {
		restaurantsPage.clickSearch();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Search Box Not Found");
		}
	//	restaurantsPage.clickSearchbox();
		restaurantsPage.clickSearchbox();
		restaurantsPage.enterItem(string);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Biryani Not Found");
		}
	}

	@When("select first available item in suggesion box")
	public void select_first_available_item_in_suggesion_box() {
		
		restaurantsPage.clickBiryani();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No items Found");
		}
	}

	@When("User navigate to dishes icon")
	public void user_navigate_to_dishes_icon() {
		searchResultPage.clickDishes();
	}
	

	@When("add Cashew Special Fried Rice to cart it will added to cart")
	public void add_cashew_special_fried_rice_to_cart_it_will_added_to_cart() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchResultPage.clickAdd();
		
	   
	}

	@When("user click on cart icon")
	public void user_click_on_cart_icon() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Items not added in cart");
		}
		
		searchResultPage.clickCart();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Items not added in cart");
		}
		
	    
	}

	@Then("he has verify the {string} Text in cart")
	public void he_has_verify_the_text_in_cart(String string) {
	   String expectedText = string;
	   String actualText = checkoutPage.verifyText();
	   Assert.assertEquals(actualText, expectedText);
	}
}
