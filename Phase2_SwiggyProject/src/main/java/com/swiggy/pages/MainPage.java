package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
//	private Actions actions;
	
	@FindBy(xpath = "//div[contains(@role,'button')]")
	private WebElement location;
	
	@FindBy(xpath = "//input[contains(@class,'_381fS _1oTLG')]")
	private WebElement searchIcon;
	
	@FindBy(xpath = "(//div[contains(@class,'_2peD4')])[1]")
	private WebElement eluruLocation;
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
//		actions = new Actions(driver);
	}
	
	public void clickLoc() {
		location.click();
		
	}
	public void searchLocation() {
		searchIcon.click();
	}
	
	public void enterLocation(String Eluru) {
		searchIcon.sendKeys(Eluru);
	}
	
	public void clickEluru() {
		eluruLocation.click();
	}

		
}

