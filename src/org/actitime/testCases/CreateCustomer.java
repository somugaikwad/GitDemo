package org.actitime.testCases;

import java.io.IOException;

import org.actitime.generics.BaseClass;
import org.actitime.generics.FileLib;
import org.actitime.pageObjects.HomePage;
import org.actitime.pageObjects.TaskListPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass {
@Test
public void createCustomer() throws IOException, InterruptedException
{
	HomePage h = new HomePage(driver);
	h.tasks().click();
	TaskListPage t = new TaskListPage(driver);
	t.addNew().click();
	t.newCustomer().click();
	FileLib f = new FileLib();
	String cn = f.getExcelValue("CreateCustomer", 1, 0);
	String cd=f.getExcelValue("CreateCustomer", 1, 1);
	t.customerName().sendKeys(cn);
	t.customerDescription().sendKeys(cd);
	t.selectCustomer().click();
	t.inputSelectCustomer().click();
	t.createCustomer().click();
	String actual = t.customerCreated().getText();
	Reporter.log(actual,true);
	try {
		Assert.assertEquals(actual, "somu");
		}
	catch(Exception e) 
	{
		
	}
	Thread.sleep(3000);
	h.timeTrack().click();
}
}
