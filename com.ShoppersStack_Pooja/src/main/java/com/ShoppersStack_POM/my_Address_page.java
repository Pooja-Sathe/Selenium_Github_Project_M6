package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class my_Address_page {
	
public my_Address_page(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}


@FindBy(xpath="//button[text()='Add Address']")
private WebElement addAdressBtn;


@FindBy(xpath="(//span[contains(@class,'MuiButton')])[2]")
private WebElement deleteBtn;


@FindBy(xpath="(//button[text()='Yes'])[1]")
private WebElement yesBtn;


public WebElement getAddAdressBtn() {
	return addAdressBtn;
}


public WebElement getDeleteBtn() {
	return deleteBtn;
}


public WebElement getYesBtn() {
	return yesBtn;
}




}
