package com.ShoppersStack_Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_utility {

	Java_Utility javaUtility = new Java_Utility();

	public void selectByValue(WebElement element, String value) {

		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectbyVisibleText(WebElement element, String Text) {

		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}

	public void selectbyIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void deselectAll(WebElement element) {
		Select sel = new Select(element);
		sel.deselectAll();
	}

	public void deselectByvalue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}

	public void deselectbyVisibleText(WebElement element, String Text) {

		Select sel = new Select(element);
		sel.deselectByVisibleText(Text);
	}

	public void webPageScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(Framework_Constants.screenshotPath + javaUtility.dateAndTime()+".png");
		FileHandler.copy(temp, dest);

	}

	public void webElementScreenShot(WebElement element) throws IOException {
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(Framework_Constants.screenshotPath + javaUtility.dateAndTime() + ".png");
		FileHandler.copy(temp, dest);

	}
	
	
	public void javaScriptExe (WebDriver driver , WebElement ele) 
	
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

}
