package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	
public Cart_page(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}


	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8']")
	private WebElement Removefromcart ;
	
	
	@FindBy(xpath="//span[text()='Buy Now']")
	private WebElement BuyNowBtn ;
	
	@FindBy(xpath="//span[text()='Continue Shopping']")
	private WebElement ContinueShoppingBtn ;

	public WebElement getRemovefromcart() {
		return Removefromcart;
	}

	public WebElement getBuyNowBtn() {
		return BuyNowBtn;
	}

	public WebElement getContinueShoppingBtn() {
		return ContinueShoppingBtn;
	}
}
