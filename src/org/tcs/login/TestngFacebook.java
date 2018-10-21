package org.tcs.login;

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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngFacebook {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	@AfterClass
	public void afterClass() {
//		driver.quit();

	}
	@BeforeMethod
	public void beforeMethod() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterMethod
	public void afterMethod() {
		Date d=new Date();
		System.out.println(d);

	}
	@Parameters({"userName","password"})
	@Test
	public void test1(String name, String pass1) {
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(name);
	
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(pass1);
		Assert.assertEquals(name, driver.findElement(By.id("email")).getAttribute("value"));
		Assert.assertEquals(pass1, driver.findElement(By.id("pass")).getAttribute("value"));

	}

}
