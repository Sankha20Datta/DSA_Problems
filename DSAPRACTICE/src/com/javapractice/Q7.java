package com.javapractice;

import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		//Check if a List Contains a Specific Element
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		
		
		boolean isPresent = numbers.stream().anyMatch(i->i==3);
		
		System.out.println(isPresent);
	}
}
