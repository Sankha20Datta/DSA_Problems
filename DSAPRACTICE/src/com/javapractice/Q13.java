package com.javapractice;

import java.util.List;

public class Q13 {

	public static void main(String[] args) {
		//Find the Last Element in a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		
		int last = numbers.stream().reduce((a,b)->b).orElse(0);
		
		System.out.println(last);
	}

}
