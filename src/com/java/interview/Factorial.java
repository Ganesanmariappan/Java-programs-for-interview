package com.java.interview;

public class Factorial {
	private static void subMethod() {
		int a = 5;
		int fact = 1;
		for (int i = 1; i <=5; i++) {
			 fact = fact*i;
		}
		System.out.println("the factorial of 5 :"+fact);
	}

	public static void main(String[] args) {
		subMethod();
	}
}
