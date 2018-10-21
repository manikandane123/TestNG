package org.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGSample {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
	}

	@Test
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Test
	public void test3() {
		// TODO Auto-generated method stub

	}

}
