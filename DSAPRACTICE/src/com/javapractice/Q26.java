package com.javapractice;

import java.util.Comparator;
import java.util.List;

public class Q26 {

	public static void main(String[] args) {
///Find the Shortest String in a List
		
		List<String> words = List.of("apple", "banana", "kiwi");
		
		String withLowestLength = words.stream().min(Comparator.comparingInt(String::length)).orElse("");
		
		System.out.println(withLowestLength);
				
	}
}
