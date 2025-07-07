package com.javapractice;

import java.util.Map;
import java.util.stream.Collectors;

public class Q38 {
	
	public static void main(String[] args) {
		// Count the Occurrences of Each Digit in a String
		
		String input = "hello 123 world 45612 6";
		
		Map<Character,Long>map 
		=input.chars()
			.mapToObj(e->(char)e)
			.filter(Character::isDigit)
			.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(map);
	}

}
