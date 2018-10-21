package org.tcs.login;

import java.util.Date;

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

public class Amazon {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
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
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchText = driver.findElement(By.id("searchDropdownBox"));
		searchText.click();
		Select ss = new Select(searchText);
		ss.selectByVisibleText("Books");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("data catalog", Keys.ENTER);
		WebElement flink = driver.findElement(By.xpath(
				"(//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal'])[1]"));
		flink.click();
		WebElement getTitle = driver.findElement(By.id("productTitle"));
		String titleofBook = getTitle.getText();
		System.out.println("Book Title: " + titleofBook);
		WebElement paperBack = driver.findElement(By.xpath("(//span[@class='a-size-large mediaTab_title'])[2]"));
		String bookType = paperBack.getText();
		System.out.println("Book Type: " + bookType);
		WebElement findElement = driver
				.findElement(By.xpath("//span[@class='a-size-medium a-color-price header-price']"));
		String text = findElement.getText();
		System.out.println("Book Price: " + text);

	}

}
