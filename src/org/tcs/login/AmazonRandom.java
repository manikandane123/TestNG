package org.tcs.login;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonRandom {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
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
	public void test() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchText = driver.findElement(By.id("searchDropdownBox"));
		searchText.click();
		Select ss = new Select(searchText);
		ss.selectByVisibleText("Books");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("data catalog", Keys.ENTER);

		List<WebElement> findLinks = driver.findElements(
				By.xpath("//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']"));

		System.out.println("Size" + findLinks.size());

		Random rr = new Random();
		findLinks.get(rr.nextInt(findLinks.size())).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("Book Title: "+ driver.findElement(By.id("productTitle")).getText());
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		System.out.println("Price: "
				+ driver.findElement(By.xpath("//span[@class='a-color-price hlb-price a-inline-block a-text-bold']"))
						.getText());

	}
}