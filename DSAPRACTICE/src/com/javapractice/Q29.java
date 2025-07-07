package com.javapractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q29 {

	//Partition a List of Integers into Even and Odd Numbers
public static void main(String[] args) {
	
	List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	
	Map<Boolean,List<Integer>>map = numbers.stream()
									.collect(Collectors.partitioningBy(e->e%2==0));
	
	System.out.println(map);
}
}
