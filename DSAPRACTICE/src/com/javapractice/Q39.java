package com.javapractice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q39 {
	
	public static void main(String[] args) {
		//Reverse a List Using Streams
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		List<Integer>reveredList = numbers.stream()
							.collect(Collectors.collectingAndThen(Collectors.toList(), list->{
							Collections.reverse(list);
							return list;
							}));
		
		System.out.println(reveredList);
	}

}
