package com.demo.calc;

public class Calculator {
	
	public int add(int... nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}

}