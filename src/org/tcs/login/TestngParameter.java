package org.tcs.login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter {
	@Parameters({"username","password"})
	@Test
	public void test1(String name, String pass) {
		System.out.println(name);
		System.out.println(pass);
	}
	@Parameters({"username","password"})
	@Test
	public void test2(String name, String pass) {
		System.out.println(name);
		System.out.println(pass);
	}	

}
