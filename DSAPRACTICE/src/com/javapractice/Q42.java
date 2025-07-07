package com.javapractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q42 {
	
	public static void main(String[] args) {
		//Find the Least Frequent Element in a List
		
		List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");

		words.stream()
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream()
		.min(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.orElse(null);
		
	String lessFrequentWord = 	words.stream()
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream()
		.min(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.orElse(null);
		
	
	System.out.println(lessFrequentWord);
		
	}

}
