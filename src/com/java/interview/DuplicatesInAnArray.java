package com.java.interview;

public class DuplicatesInAnArray {

	private static void subMethod() {
		int a[] = {1,2,3,4,5,3,2,};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]== a[j]) {
					System.out.println("The Duplicate number :"+a[j]+" "+j);
				}
			}
		}
	}
	public static void main(String[] args) {
		subMethod();
	}
	
}
