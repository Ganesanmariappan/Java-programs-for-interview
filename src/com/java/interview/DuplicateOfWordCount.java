package com.java.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateOfWordCount {

	private static void subMethodUsingMap() {
		Map<String, Integer> m = new HashMap<>();
		
		String s = "For the people Of the people By the people";
		
		String[] sp = s.split(" ");
		
		for (String st : sp) {
			if (m.containsKey(st)) {
				m.put(st, m.get(st)+1);
			} else {
				m.put(st, 1);
			}
		}
		
		Set<Entry<String, Integer>> et = m.entrySet();
		for (Entry<String, Integer> en : et) {
			System.out.println(en);
		}
	}
	
	public static void main(String[] args) {
		subMethodUsingMap();
	}
	
}
