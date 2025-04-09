package com.java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {

	public static void main(String[] args) {
		//Given a list of integers, find all the elements that appear more than once.
		
		List<Integer>list = Arrays.asList(1,2,1,4,5,2,6,4);
		
		List<Integer>filterlist=	list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
					.entrySet()
					.stream()
					.filter(e->e.getValue()==1)
					.map(e->e.getKey())
					.collect(Collectors.toList());
		
		System.out.println(filterlist);
		
		
	}
}
