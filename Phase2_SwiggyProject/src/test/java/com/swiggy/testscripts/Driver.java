package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.swiggy.pages.*;

public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static MainPage mainpage;
	protected static RestaurantsPage restaurantsPage;
	protected static Actions actions;
	protected static SearchResultPage searchResultPage;
	protected static CheckOutPage checkoutPage;
	
	public static void init() {
		driver = new ChromeDriver();
		landingPage = new LandingPage(driver);
		mainpage = new MainPage(driver);
		restaurantsPage = new RestaurantsPage(driver);
		actions = new Actions(driver);
		searchResultPage = new SearchResultPage(driver);
		checkoutPage = new CheckOutPage(driver);
	}
}
