package com.javapractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q36 {

	public static void main(String[] args) {
		
		// Count the Occurrences of Each Word in a String
		
		String input = "hello world hello";
		
		Map<String , Long> map=Arrays.stream(input.split(" "))
								.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		
		System.out.println(map);
				
	}
}
