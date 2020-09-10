package org.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.actitime.pageObjects.HomePage;
import org.actitime.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void initilizeBrowser() throws IOException {
		FileLib f = new FileLib();
		String browserName = f.browser();
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// open FireFox
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass()
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod
	public void loginClick() throws IOException {
		FileLib f = new FileLib();
		String url = f.getProperty("url");
		String un = f.getProperty("username");
		String pwd = f.getProperty("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.userName().sendKeys(un);
		l.passWord().sendKeys(pwd);
		l.login().click();
	}

	@AfterMethod
	public void logoutClick() {
		HomePage h = new HomePage(driver);
		h.logout().click();
	}
}
