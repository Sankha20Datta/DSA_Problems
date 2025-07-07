package com.javapractice;

import java.util.Map;
import java.util.stream.Collectors;

public class Q35 {
	public static void main(String[] args) {
		//Count the Occurrences of Each Character in a String
		
		String input = "hello";
		
		Map<Character,Long>map
					=input.chars()
					.mapToObj(c->(char)c)
					.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(map);
	}

}
