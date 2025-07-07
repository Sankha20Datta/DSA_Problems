package com.javapractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q43 {
	
	public static void main(String[] args) {
		
		
		//Find the First Non-Repeated Character in a String
		
		String input = "hello";
		
		Character charName = input.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new , Collectors.counting()))  // Here  I am using HashMap as it  preserves the insertion order
		.entrySet().stream()
		.filter(e->e.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
		
		
		System.out.println(charName);
	}

}
