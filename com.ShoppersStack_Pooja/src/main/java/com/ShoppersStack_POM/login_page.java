package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	
	public login_page(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbtnTextField;


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getLoginbtnTextField() {
		return loginbtnTextField;
	}
	
	
	
	
	

}
