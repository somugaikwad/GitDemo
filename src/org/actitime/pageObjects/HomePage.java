package org.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	@FindBy(id = "container_tasks")
	private WebElement tasks;
	@FindBy(id = "container_tt")
	private WebElement timeTrack;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement logout() {
		return logout;
	}

	public WebElement tasks() {
		return tasks;
	}

	public WebElement timeTrack() {
		return timeTrack;
	}
}
