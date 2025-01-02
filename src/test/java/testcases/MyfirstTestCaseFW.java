package testcases;

import javax.sound.sampled.TargetDataLine;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyfirstTestCaseFW extends BaseTest {

	@Test(dataProvider = "testdata")

	public static void LoginTest(String username, String password) throws InterruptedException {

		driver.findElement(By.xpath(loc.getProperty("signin_link"))).click(); // locators--properties
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(8000);
	}

	@DataProvider(name = "testdata")
	public Object[][] tData() {
		return new Object[][] { { "Sanjeev07feb@gmail.com", "Zoho@0702" }, { "Sanjeev07feb@gmail.com", "Zoho0702" }, { "sk@gmail.com", "Zoho0702" } };
	}
}
