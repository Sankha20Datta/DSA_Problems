package com.javapractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q27 {

	public static void main(String[] args) {
		
//		/Group a List of Strings by Their Length
		
		List<String> words = List.of("apple", "banana", "kiwi","mango");
		
		Map<Integer,List<String>>map = words.stream().collect(Collectors.groupingBy(String::length));
		
		
		System.out.println(map.toString());
	}
}
