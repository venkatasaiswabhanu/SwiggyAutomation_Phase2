package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	private Actions actions;
	@FindBy(xpath = "(//button[contains(@class,'_2wXvU')])[2]")
	private WebElement dishes;
	
	@FindBy(xpath = "(//div[contains(@class,'_1RPOp')])[1]")
	private WebElement add;
	
	@FindBy(xpath = "(//div[contains(@class,'_2CgXb')])[1]")
	private WebElement cart;
	
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickDishes() {
		dishes.click();
	}
	
	public void clickAdd() {
		add.click();
	}
	public void clickCart() {
		cart.click();
	}
}
