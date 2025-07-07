package com.javapractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q34 {

	public static void main(String[] args) {
		//Count the Occurrences of Each Element in a List
		
		List<String> words = List.of("apple", "banana", "apple", "orange");
		
		Map<String,Long>map = words.stream()
							.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		System.out.println(map);
	}
}
