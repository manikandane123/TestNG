package org.test.login;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BobcatProducts {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/index");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		 driver.quit();
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
	public void test1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("accept")).click();
		driver.findElement(By.xpath("(//a[@class='text-uppercase text-center has-sub dtm-pro-fam-txt-name'])[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='dtm-pro-grp-txt-name'])[4]")).click();

		List<WebElement> elements = driver
				.findElements(By.xpath("//div[@class='sub-nav open-3']//div[@id='subset-1']//h5"));

		for (WebElement x : elements) {
			System.out.println(x.getText());

			List<WebElement> startPrice = driver
					.findElements(By.xpath("//div[@class='sub-nav open-3']//div[@id='subset-1']//p"));
			for (WebElement v : startPrice) {
				System.out.println(v.getText());
				break;
			}

		}
	}

	@Test
	public void test2() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div//h3//i[@class='fa fa-angle-left'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='dtm-pro-grp-txt-name'])[5]")).click();
		List<WebElement> toolWork = driver
				.findElements(By.xpath("//div[@class='sub-nav open-3']//div[@id='subset-2']//h5"));

		for (WebElement k : toolWork) {
			System.out.println(k.getText());
			List<WebElement> attachments = driver
					.findElements(By.xpath("//div[@class='sub-nav open-3']//div[@id='subset-2']//p"));
			for (WebElement sp : attachments) {
				System.out.println(sp.getText());
				break;
				
			}

		}

	}
}
