package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q11 {

	public static void main(String[] args) {
		
		//Convert a List of Integers to Their Squares
		

		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		List<Integer>numbersSquare = numbers.stream().map(e->e*e).collect(Collectors.toList());
		
		System.out.println(numbersSquare);
	}
}
