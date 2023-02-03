package com.java.interview;

public class CountVowelConsonantInString {

	private static void subMethod() {
		
		String s = "java program";
		int consonant = 0;
		int vowel = 0;
		int space = 0;
		String l = s.toLowerCase();
		for (int i = 0; i < l.length(); i++) {
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowel++;
			} else if(s.charAt(i)==' ') {
				space++;
			}else {
				consonant++;
			}
		}
		System.out.println("The number of vowel present in string :"+vowel);
		System.out.println("The number of consonant present in string :"+consonant);
		System.out.println("The number of space present in string :"+space);
	}
	public static void main(String[] args) {
		subMethod();
	}
}
