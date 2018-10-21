package org.tcs.login;

import org.testng.annotations.Test;

public class TestngSample {
	@Test(priority = 45)
	public void test1() {
		System.out.println("TestNG Priority is 45");
	}

	@Test(priority = -12)
	public void test2() {
		System.out.println("TestNG Priority is -12");
	}

	@Test(priority = 19)
	public void test3() {
		System.out.println("TestNG Priority is 19");
	}

	@Test(priority = 1)
	public void test4() {
		System.out.println("TestNG Priority is 1");
	}

	@Test(priority = 13)
	public void test5() {
		System.out.println("TestNG Priority is 13");
	}
}
