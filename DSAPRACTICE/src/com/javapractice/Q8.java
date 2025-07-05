package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q8 {

	public static void main(String[] args) {
		
		//Filter Out Even Numbers from a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		List<Integer>evenNumbers = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers.toString());
	}
}
