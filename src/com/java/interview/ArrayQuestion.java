package com.java.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayQuestion {

	private static void subMethod() {
		System.out.println("find the third largest in an array");
		int a[] = {1,2,5,6,3,8};
		Arrays.sort(a);
		System.out.println(a[2]);
	}
	
	private static void subMethod1() {
		System.out.println("find the third largest in an array");
		Integer a[] = {1,8,5,6,3,2};
		 List<Integer> l = Arrays.asList(a);
		 System.out.println(l);
		 Collections.sort(l);
		 System.out.println(l);
		 System.out.println(l.get(2));
		 
	}
	public static void main(String[] args) {
		subMethod();
		subMethod1();
	}
	
	
}
