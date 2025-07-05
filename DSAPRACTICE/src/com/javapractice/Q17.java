package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q17 {
	
	public static void main(String[] args) {
		//Sort a List of Integers in Ascending Order
		List<Integer> numbers = List.of(5, 3, 1, 4, 2);
		
		List<Integer>sortednumbers = numbers.stream().sorted().collect(Collectors.toList());
		
			
		
		System.out.println(sortednumbers);
	}

}
