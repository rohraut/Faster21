package com.resonance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.resonance.keywords.UIKeywords;

  //@Deprecated
public class HomePage {
	
	@FindBy(css="a[href=\"/assignments\"]")
	public   WebElement assignementsLnk;
	@FindBy(css="a.sf-with-ul")
	public WebElement coursesLnk;
	public WebElement videosLnk=UIKeywords.driver.findElement(By.cssSelector("li#menu-item-353 a[href=\"https://www.youtube.com/channel/UCg_SUG_BAPtVUvTSKse2xBg\"]"));//initialization
	public WebElement NotesLnk;
	
	public  void ClickOnAssignements() {
		assignementsLnk.click();

	}
	public void ClickOnCourses() {
		coursesLnk.click();

	}
	public void clickOnVideos() {
		videosLnk.click();

	}
	public void clickOnNotes() {
		NotesLnk.click();

	}
	
	

}
