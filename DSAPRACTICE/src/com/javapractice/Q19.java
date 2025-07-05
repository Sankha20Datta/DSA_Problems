package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q19 {

	
	public static void main(String[] args) {
		// Sort a List of Strings in Alphabetical Order
		
		List<String> words = List.of("banana", "apple", "cherry");
		
		
		List<String>sortedWords = words.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedWords);
	}
}
