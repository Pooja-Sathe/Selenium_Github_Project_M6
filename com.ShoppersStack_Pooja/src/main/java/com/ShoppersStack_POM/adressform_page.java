package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adressform_page {
	
	
public adressform_page(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}


@FindBy(id="Home")
private WebElement homeRB;


@FindBy(id="Name")
private WebElement nameTextField;


@FindBy(id="House/Office Info")
private WebElement houseTextField;


@FindBy(id="Street Info")
private WebElement streetTextField;


@FindBy(id="Landmark")
private WebElement landmarkTextField;


public WebElement getLandmarkTextField() {
	return landmarkTextField;
}


@FindBy(id="Country")
private WebElement countryDD;


@FindBy(id="State")
private WebElement stateDD;


@FindBy(id="City")
private WebElement cityDD;


@FindBy(id="Pincode")
private WebElement pincodeTextField;


@FindBy(id="Phone Number")
private WebElement phonenumberTextField;

@FindBy(id="addAddress")
private WebElement addAdressBtn;

public WebElement getHomeRB() {
	return homeRB;
}

public WebElement getNameTextField() {
	return nameTextField;
}

public WebElement getHouseTextField() {
	return houseTextField;
}

public WebElement getStreetTextField() {
	return streetTextField;
}

public WebElement getCountryDD() {
	return countryDD;
}

public WebElement getStateDD() {
	return stateDD;
}

public WebElement getCityDD() {
	return cityDD;
}

public WebElement getPincodeTextField() {
	return pincodeTextField;
}

public WebElement getPhonenumberTextField() {
	return phonenumberTextField;
}

public WebElement getAddAdressBtn() {
	return addAdressBtn;
}




}
