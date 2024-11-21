package com.ShoppersStack_Test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_Generic_Utility.Base_Test;
import com.ShoppersStack_POM.my_Address_page;
import com.ShoppersStack_POM.my_profile_page;

public class TC_002_Verify_user_is_able_to_delete_addadress_or_not_Test extends Base_Test{
	
	@Test
	
	public void deleteadress() throws InterruptedException, IOException {
		
		
		homePage.getAccountsettingsBtn().click();
		homePage.getMyprofileBtn().click();
		
		
		my_profile_page MyProfilePage =new my_profile_page(driver);
		
		MyProfilePage.getMyAdressesBtn().click();	
		
		Thread.sleep(2000);
		my_Address_page MyAddressPage=new my_Address_page(driver);
		MyAddressPage.getDeleteBtn().click();
		Thread.sleep(2000);
		MyAddressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		webdriverUtility.webPageScreenShot(driver);
		
	}

}
