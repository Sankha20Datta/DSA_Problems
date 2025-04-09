package com.ArrayProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question16 {
	
	public static void main(String[] args) {
		
		
		List<Integer>list = IntStream.range(1, 5).filter(e->e%2==0).boxed().collect(Collectors.toList());
		
		int totalSum= IntStream.range(1,5).reduce(0, Integer::sum);
		//List<Integer>list = List.of(12,67,34,68,48);
		//int max = list.stream().reduce(Integer.MAX_VALUE , (a,b)->a>b?a:b);
		
		
		//System.out.println(max);
		
		List<Number>tempList = List.of(1,2.3,4,5);
		tempList.add(6);
		
		System.out.println(tempList);
	}

}
