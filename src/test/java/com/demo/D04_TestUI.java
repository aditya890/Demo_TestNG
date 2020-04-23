package com.demo;

import org.testng.annotations.Test;

public class D04_TestUI {

	@Test(dependsOnMethods="test_signup", groups="ui")
	public void test_signin() {
		System.out.println("testing signin");
	}
	@Test(groups="ui")
	public void openBrowser() {
		System.out.println("testing browser");
	}
	
	@Test(dependsOnMethods="test_signin", groups="ui")
	public void test_logout() {
		System.out.println("testing logout");
	}
	
	@Test(dependsOnMethods="openBrowser", groups="ui")
	public void test_signup() {
		System.out.println("testing signup");
	}
	
	@Test(groups="db")
	public void testDb() {
		System.out.println("find database data");
	}
}