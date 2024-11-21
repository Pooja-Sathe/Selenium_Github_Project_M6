package com.ShoppersStack_Test_Scripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShoppersStack_Generic_Utility.Base_Test;
import com.ShoppersStack_POM.Cart_page;
import com.ShoppersStack_POM.Delivery_adress_page;
import com.ShoppersStack_POM.Payment_method_page;

public class TC_003_Verify_user_is_able_to_order_product_or_not_Test extends Base_Test {

	@Test

	public void orderproduct() throws InterruptedException, IOException {

		Thread.sleep(3000);
		webdriverUtility.javaScriptExe(driver, homePage.getFeaturedProducts());
		// WebDriver(driver, home_page.getFeaturedProducts());

		wait.until(ExpectedConditions.elementToBeClickable(homePage.getAddtocart()));
		Thread.sleep(2000);
		homePage.getAddtocart().click();
		homePage.getCartBtn().click();

		Cart_page cartpage = new Cart_page(driver);
		Thread.sleep(2000);
		cartpage.getBuyNowBtn().click();

		Delivery_adress_page deliveradresspage = new Delivery_adress_page(driver);
		deliveradresspage.getAdressBtn().click();
		deliveradresspage.getProceedBtn().click();

		Payment_method_page paymentmethodpage = new Payment_method_page(driver);
		paymentmethodpage.getCashondeliveryRBtn().click();
		paymentmethodpage.getProceedBtn().click();
		Thread.sleep(2000);
		webdriverUtility.webPageScreenShot(driver);
		Thread.sleep(7000);

	}

}
