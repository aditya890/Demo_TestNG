package com.demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.calc.Calculator;

public class D05_DataProvider {

	@DataProvider(name="method-name")
	public static Object[][] data(){
		return new Object[][] {{1,1,2},{6,8,14},{6,-3,3}};
	}
	
	@Test(dataProvider="method-name")
	public void testAdd(int a, int b, int result) {
		Calculator calc = new Calculator();
		Assert.assertSame(calc.add(a,b), result);
	}
}