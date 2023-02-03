package com.java.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class StringFunctions5 {
	public static List<Integer> l = new ArrayList<>();
	public static void main(String[] args) {
		String s = "Sanjaye"; // Saareshua
		System.out.println("Input: "+s);
		
		char[] vowelsArr = new char[s.length()];
		int a = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				l.add(i);  
				vowelsArr[a++] = ch;

			} else if (ch == 'e') {
				l.add(i);
				vowelsArr[a++] = ch;

			} else if (ch == 'i') {
				l.add(i);
				vowelsArr[a++] = ch;

			} else if (ch == 'o') {
				l.add(i);
				vowelsArr[a++] = ch;

			} else if (ch == 'u') {
				l.add(i);
				vowelsArr[a++] = ch;
			}
		}
		System.out.println(vowelsArr);
		System.out.println("Reverse Indexes: "+l);	
		int newIndex=0;
		String output="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (l.contains(i)) {
				ch = vowelsArr[newIndex];
				newIndex++;
			}
			output=output+ch;
		}
		System.out.println("OutPut: "+output);
	}
}
