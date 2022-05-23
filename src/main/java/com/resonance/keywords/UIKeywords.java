package com.resonance.keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.utils.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else {
			System.err.println("invalid_browser name: " + browserName);
		}

	}

	public static void launchURL(String url) {
		driver.get(url);
		System.out.println("Url is launched");
	}

	public static String getTitle(String title) {
		System.out.println("Title of WebPage: " + driver.getTitle());
		return driver.getTitle();
	}

	/**
	 * This method can be used to enter provided text in a specified
	 * {@code WebElement}
	 * 
	 * @param element     in which we want to enter text
	 * @param textToEnter this is the text you want to enter This method is
	 *                    deprecated and no longer in use.
	 */
	@Deprecated
	public static void enterText(WebElement element, String textToEnter) {
		// WebElement element1=
		// driver.findElement(By.cssSelector("a[href=\"https://ijmeet.com/app?csrt=4858559092614854069\"]"));
		// element1.sendKeys("rohan");
		// driver.findElement(By.cssSelector("a[href=\"https://ijmeet.com/app?csrt=4858559092614854069\"]")).sendKeys("rohan");
		element.sendKeys(textToEnter);
	}

	public static void enterText(By by, String textToEnter) {
		driver.findElement(by).sendKeys(textToEnter);

	}

	public static void enterText(String locatorValue, String textToEnter) {
		driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);

	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Browser windows are closed");
	}

	public static void quiteBrowser() {
		driver.quit();
		System.out.println("Browser windows are quite");

	}

	public static void click(String locator) {

		//System.out.println("locator: " + locator);
		String locatorType = locator.split("##")[0];
		String locatorValue = locator.split("##")[1];
		//driver.findElement(By.cssSelector(locator)).click();

		if (locatorType == "CSS") {
			driver.findElement(By.cssSelector(locatorValue)).click();
		} else if (locatorType == "XPATH") {
			driver.findElement(By.xpath(locatorValue)).click();
		} else {
			System.err.println("Invalid LocatorType: " + locatorType);
		}

	}

}
