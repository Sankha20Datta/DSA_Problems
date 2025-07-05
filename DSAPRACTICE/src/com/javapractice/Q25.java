package com.javapractice;

import java.util.Comparator;
import java.util.List;

public class Q25 {

	
	public static void main(String[] args) {
		
		// Find the Longest String in a List
		
		List<String> words = List.of("apple", "banana", "kiwi");
		
		
		String withMaxLenString = words.stream()
									.max(Comparator.comparingInt(String::length))
									.orElse("");
		
		System.out.println(withMaxLenString);
	}
}
