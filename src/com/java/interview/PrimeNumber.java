package com.java.interview;

import java.util.Iterator;

public class PrimeNumber {

	private static void singleNumber() {
		int a = 7;
		int count = 0;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {

				count++;
			}

		}
		if (count == 0) {
			System.out.println("It is prime Number :" + a);
		} else {
			System.out.println("It is Not a Prome Number :" + a);
		}
	}

	
	
	
	
	
	
	
	
	
	private static void for1To100Number() {

		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {

					count++;
				}
			}
			if (count == 0) {
				System.out.println("It is a Prime Number :" + i);
			} else {
				System.out.println("It is Not A Prime Number :" + i);
			}

		}

	}

	public static void main(String[] args) {

		for1To100Number();

	}

}
