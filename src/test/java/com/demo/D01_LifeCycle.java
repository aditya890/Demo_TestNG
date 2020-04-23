package com.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D01_LifeCycle {

	@BeforeClass
	public void beforeClass() {
		dots(2);
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass() {
		dots(2);
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		dots(3);
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod() {
		dots(3);
		System.out.println("After Method");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeTest
	public void beforeTest() {
		dots(1);
		System.out.println("Before test");
	}
	@AfterTest
	public void afterTest() {
		dots(1);
		System.out.println("After test");
	}
	
	@Test
	public void test1() {
		dots(4);
		System.out.println("D01::test case 1");
	}
	@Test
	public void test2() {
		dots(4);
		System.out.println("D01::test case 1");
	}
	
	private void dots(int n) {
		if(n>0) {
			for(int i=0;i<n;i++) {
				System.out.print("...");
			}
		}
	}
}