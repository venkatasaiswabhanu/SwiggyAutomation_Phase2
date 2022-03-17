package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(xpath = "//div[contains(@class,'B5DgV')]")
	private static WebElement checkout;
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public static String verifyText() {
		String text = checkout.getText();
		return text;
	}

}
