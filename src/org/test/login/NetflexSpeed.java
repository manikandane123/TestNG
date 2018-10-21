package org.test.login;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NetflexSpeed {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		Date dd = new Date();
		System.out.println(dd);
	}

	@AfterMethod
	public void afterMethod() {
		Date dd = new Date();
		System.out.println(dd);
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//a//span[contains(text(),'Speed Test')]")).click();

		// Locator to be find until the internet speed number get stop

		WebDriverWait wait = new WebDriverWait(driver, 70);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='speed-results-container succeeded']")));
		String text = element.getText();
		System.out.println(text+" "+driver.findElement(By.id("speed-units")).getText());

		// Locator to be find till the refresh button shows

		WebDriverWait ww = new WebDriverWait(driver, 70);
		WebElement elem = ww.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='speed-progress-indicator circle succeeded']")));

		System.out.println(driver.findElement(By.id("speed-value")).getText() + " "
				+ driver.findElement(By.id("speed-units")).getText());


	}

}
