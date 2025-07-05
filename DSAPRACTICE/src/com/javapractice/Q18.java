package com.javapractice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q18 {
	
	public static void main(String[] args) {
		// Sort a List of Integers in Descending Order
		List<Integer> numbers = List.of(5, 3, 1, 4, 2);
		
		List<Integer>sortedDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sortedDesc);
	}

}
