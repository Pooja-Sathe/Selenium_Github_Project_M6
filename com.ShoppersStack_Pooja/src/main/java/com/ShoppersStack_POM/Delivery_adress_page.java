package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delivery_adress_page {
	
	
public Delivery_adress_page(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@type='radio'][1]")
	private WebElement adressBtn ;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedBtn ;

	public WebElement getAdressBtn() {
		return adressBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	
	

}
