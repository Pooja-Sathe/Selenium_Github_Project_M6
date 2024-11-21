package com.ShoppersStack_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcome_page {
	
	public welcome_page(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
