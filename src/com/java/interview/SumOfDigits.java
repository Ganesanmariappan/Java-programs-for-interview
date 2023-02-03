package com.java.interview;

public class SumOfDigits {

	private static void subMethod() {
		int a = 12345;
		int sum = 0;
		int digit;

		while (a > 0) {
			digit = a % 10;
			sum = sum + digit;
			a = a / 10;
		}

		System.out.println("The sum of didgits : " + sum);
	}

	public static void main(String[] args) {
		subMethod();
	}
}
