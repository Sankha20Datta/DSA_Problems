package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q10 {
	
	public static void main(String[] args) {
//		/Convert a List of Strings to Uppercase
		
		List<String> words = List.of("hello", "world");
		
		List<String>upperString = words.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperString);
	}

}
