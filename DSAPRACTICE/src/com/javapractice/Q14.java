package com.javapractice;

import java.util.List;

public class Q14 {

	
	public static void main(String[] args) {
		
		//Check if All Elements in a List Satisfy a Condition
		
		List<Integer> numbers = List.of(2, 4);

		
		boolean  isMatch = numbers.stream().allMatch(e->e%2==0);
		
		System.out.println(isMatch);
	}
}
