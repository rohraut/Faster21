package com.tests;

import java.io.IOException;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.config.BaseTest;
import com.resonance.keywords.UIKeywords;
import com.resonance.pages.HomePage;
import com.utils.Environment;
import com.utils.OR;
import com.utils.PropertiesFile;

public class RegressionTests extends BaseTest {
//Environment en = new Environment();
	//UIKeywords uk = new UIKeywords();
	@Test
	public void verifyTitleOfHomePage() throws IOException {

		UIKeywords.openBrowser("chrome");
		UIKeywords.launchURL(Environment.getAppUrl());
		// String actualTitle = UIKeywords.getTitle("rohan");
		// WebElement element =null;

		// UIKeywords.enterText("input#user","hello");
		// Assert.assertEquals(actualTitle, "Amazon.com. Spend less. Smile more.");

	}

	@Test
	public static void verifyConfirmationAlertIsOpened() throws IOException, InterruptedException {

		// String assignment =
		// PropertiesFile.getValue("\\src\\main\\resources\\OR.properties","Assingments");
		// UIKeywords.click(assignment);
		// UIKeywords.click(OR.AssignmentLocator());
		// System.out.println("clicked on Assingments");
		// String confAlert =
		// PropertiesFile.getValue("/src/main/resources/OR.properties","ConfirmationAlert");
		// UIKeywords.click(confAlert);
		// Thread.sleep(3000);

		// System.out.println("clicked on Conf.Alert");
		//HomePage home = new HomePage();//1st way
		HomePage home = PageFactory.initElements(UIKeywords.driver,HomePage.class);
		home.ClickOnAssignements();
		//UIKeywords.click(OR.ConfirmatonAlert());
		
		//home.ClickOnCourses();
		//home.clickOnVideos();
	}

}
