package com.javapractice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Q23 {

	public static void main(String[] args) {
		//Find the Second-Largest Element in a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
			int secndLargest = numbers.stream().sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst().orElse(0);
			
			System.out.println(secndLargest);
	}
}
