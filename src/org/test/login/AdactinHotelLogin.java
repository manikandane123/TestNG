package org.test.login;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotelLogin {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

	@BeforeMethod
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void test1() {
		
		Assert.assertEquals("http://www.adactin.com/HotelApp/", driver.getCurrentUrl());
		Assert.assertTrue(driver.getTitle().contains("AdactIn"));
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("pradeep1949");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("greenstech123");
		 WebElement clickLogin = driver.findElement(By.id("login"));
		 clickLogin.click();

	}

}
