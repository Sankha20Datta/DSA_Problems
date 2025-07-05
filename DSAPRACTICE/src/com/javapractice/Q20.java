package com.javapractice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q20 {

	public static void main(String[] args) {
		// Sort a List of Strings by Their Length
		
		List<String> words = List.of("apple", "banana", "kiwi");
		
		List<String>wordsSortedByLength = words.stream().sorted(Comparator.comparingInt(String::length))
						.collect(Collectors.toList());
		
		
		System.out.println(wordsSortedByLength);
	}
}
