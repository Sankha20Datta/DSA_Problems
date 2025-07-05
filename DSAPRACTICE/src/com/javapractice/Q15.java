package com.javapractice;

import java.util.List;

public class Q15 {

	public static void main(String[] args) {
		
		//Check if Any Element in a List Satisfies a Condition
		
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		
		boolean isAnyMatch = numbers.stream().anyMatch(e->e-2==6);
		
		System.out.println(isAnyMatch);
	}
}
