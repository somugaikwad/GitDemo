package org.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNew;
	@FindBy(xpath = "//div[@class='dropdownContainer addNewMenu']/div[1]")
	private WebElement newCustomer;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomer;
	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Our company']")
	private WebElement inputSelectCustomer;
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomer;
	@FindBy(xpath = "//div[@class='title' and text()='HDFC_001']")
	private WebElement customerCreated;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement addNew() {
		return addNew;
	}

	public WebElement newCustomer() {
		return newCustomer;
	}

	public WebElement customerName() {
		return customerName;
	}

	public WebElement customerDescription() {
		return customerDescription;
	}

	public WebElement selectCustomer() {
		return selectCustomer;
	}

	public WebElement inputSelectCustomer() {
		return inputSelectCustomer;
	}

	public WebElement createCustomer() {
		return createCustomer;
	}

	public WebElement customerCreated() {
		return customerCreated;
	}
}
