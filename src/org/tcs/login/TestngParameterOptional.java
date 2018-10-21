package org.tcs.login;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterOptional {
	@Parameters({ "username", "passw" })
	@Test
	public void test1(String name, @Optional ("Hello")String password) {
		System.out.println(name);
		System.out.println(password);
	}

}
