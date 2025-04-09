package com.java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question3 {

	public static void main(String[] args) {
		List<Employee>list = new ArrayList<Employee>();
		
		list.add(new Employee(1,"A",50000.00,"HR"));
		list.add(new Employee(2,"B",150000.00,"IT"));
		list.add(new Employee(3,"C",200000.00,"HR"));
		list.add(new Employee(4,"D",200000.00,"IT"));
		
		
		
		Map<String,List<Employee>>filtereMap = list.stream()
													.collect(Collectors.groupingBy(Employee::getDepartment));
		
		filtereMap.forEach((dept,list1)->{
			System.out.println( dept +"----"+list1);
		});
	}
}
