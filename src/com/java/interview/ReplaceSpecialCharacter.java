package com.java.interview;

public class ReplaceSpecialCharacter {

	
	private static void subMethod() {
		String s = "This&String@Contains*Special^Characters%";
		String r = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(r);
	}
	public static void main(String[] args) {
		subMethod();
	}
	
	
	
}
