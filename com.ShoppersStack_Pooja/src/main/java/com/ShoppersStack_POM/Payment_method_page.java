package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_method_page {
	
public Payment_method_page(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement cashondeliveryRBtn ;
	
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedBtn ;


	public WebElement getCashondeliveryRBtn() {
		return cashondeliveryRBtn;
	}


	public WebElement getProceedBtn() {
		return proceedBtn;
	}

}
