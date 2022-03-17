package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantsPage {
	
	private Actions actions;
	
	@FindBy(xpath = "(//div[contains(@class,'_2CgXb')])[5]")
	private WebElement search;
	
	@FindBy(xpath = "//input[contains(@class,'_2BJMh')]")
	private WebElement items;
	
	@FindBy(xpath = "//div[contains(@class,'_34T1N')]")
	private WebElement cashewBiryani;
	
	public RestaurantsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickSearch() {
		search.click();
	}
	
	public void clickSearchbox() {
		items.click();
	}
	public void enterItem(String CashewBiryani) {
		items.sendKeys(CashewBiryani);
		
	}
	
	public void clickBiryani() {
		cashewBiryani.click();
	}
	

}
