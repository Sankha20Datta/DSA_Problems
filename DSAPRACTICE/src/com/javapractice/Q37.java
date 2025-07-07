package com.javapractice;

import java.util.Map;
import java.util.stream.Collectors;

public class Q37 {

	public static void main(String[] args) {
		
		//Count the Occurrences of Each Vowel in a String
		
		String input = "hello world";
		
		Map<Character,Long>map  = input.chars()
									.mapToObj(c->(char)c)
									.filter(c->"aeiou".contains(String.valueOf(c)))
									.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(map);
	}
}
