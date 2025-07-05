package com.javapractice;

import java.util.List;

public class Q12 {

	
	public static void main(String[] args) {
		
//		/Find the First Element in a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		
		int first = numbers.stream().findFirst().orElse(0);
		
		System.out.println(first);
	}
}
