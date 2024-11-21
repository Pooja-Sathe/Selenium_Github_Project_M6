package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {

	public home_page(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge')]")
	private WebElement accountsettingsBtn;

	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myprofileBtn;

	@FindBy(xpath = "//span[text()='FOREVER21']/../../../div[3]/div[2]/button")
	private WebElement addtocart;

	@FindBy(id = "cart")
	private WebElement cartBtn;

	@FindBy(xpath = "//h1[text()='Featured Products']")
	private WebElement FeaturedProducts;

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getFeaturedProducts() {
		return FeaturedProducts;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getAccountsettingsBtn() {
		return accountsettingsBtn;
	}

	public WebElement getMyprofileBtn() {
		return myprofileBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

}
