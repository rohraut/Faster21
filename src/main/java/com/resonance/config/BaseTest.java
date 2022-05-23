package com.resonance.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.resonance.keywords.UIKeywords;
import com.utils.Environment;


public class BaseTest {
	//public static  OR or = new OR();
	@BeforeMethod
	public void setUp() throws Exception {
		UIKeywords.openBrowser("chrome");
		UIKeywords.launchURL(Environment.getAppUrl());

	}

	@AfterMethod
	public void tearDownMethod() throws Exception {
     UIKeywords.quiteBrowser();
	}

}
