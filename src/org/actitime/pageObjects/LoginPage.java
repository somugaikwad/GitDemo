package org.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement username;

@FindBy(name="pwd")
private WebElement password;

@FindBy(id="loginButton")
private WebElement login;

public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public WebElement userName() 
{
	return username;
}
public WebElement passWord() 
{
	return password;
}
public WebElement login() 
{
	return login;
}
}
