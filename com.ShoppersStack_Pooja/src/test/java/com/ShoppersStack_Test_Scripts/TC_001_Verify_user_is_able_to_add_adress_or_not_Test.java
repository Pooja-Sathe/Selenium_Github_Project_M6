package com.ShoppersStack_Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_Generic_Utility.Base_Test;
import com.ShoppersStack_POM.adressform_page;
import com.ShoppersStack_POM.my_Address_page;
import com.ShoppersStack_POM.my_profile_page;

public class TC_001_Verify_user_is_able_to_add_adress_or_not_Test extends Base_Test {

	@Test

	public void addAdress() throws InterruptedException, EncryptedDocumentException, IOException {

		Thread.sleep(2000);
		homePage.getAccountsettingsBtn().click();
		homePage.getMyprofileBtn().click();

		my_profile_page MyProfilePage = new my_profile_page(driver);

		MyProfilePage.getMyAdressesBtn().click();

		Thread.sleep(3000);

		my_Address_page MyAddressPage = new my_Address_page(driver);
		MyAddressPage.getAddAdressBtn().click();
		adressform_page AdressFormPage = new adressform_page(driver);

		AdressFormPage.getHomeRB().click();
		AdressFormPage.getNameTextField().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 0));
		AdressFormPage.getHouseTextField().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 1));
		AdressFormPage.getStreetTextField().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 2));
		AdressFormPage.getLandmarkTextField().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 3));
		webdriverUtility.selectByValue(AdressFormPage.getCountryDD(), fileUtility.readPropertyFile("Country"));
		webdriverUtility.selectByValue(AdressFormPage.getStateDD(), fileUtility.readPropertyFile("State"));
		webdriverUtility.selectByValue(AdressFormPage.getCityDD(), fileUtility.readPropertyFile("City"));
		AdressFormPage.getPincodeTextField().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 4));
		AdressFormPage.getPhonenumberTextField().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 5));
		AdressFormPage.getAddAdressBtn().click();

		Thread.sleep(8000);

	}

}
