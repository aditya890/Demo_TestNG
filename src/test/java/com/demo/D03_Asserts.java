package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D03_Asserts {
	@Test
	public void test() {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = null;
		
		Assert.assertNull(str4);
		Assert.assertNotNull(str2);
//		boolean flag = str1 == str3;
//		str1.equals(str3)
		
//		boolean f = str1 == str2;
		
		Assert.assertTrue(str1 == str2);
		Assert.assertTrue(str1.equals(str3));
		
		Assert.assertEquals(str1, str3);// looks for value
		Assert.assertNotSame(str1, str3);// looks for reference
		Assert.assertSame(str1, str2);// looks for reference
		
		// works in junit
//		Assert.assertSame("both strings are not same object", str1, str3);
		
	}
	
	

}