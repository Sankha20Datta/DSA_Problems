package com.java8Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemClass {

	public static void main(String[] args) {
		
		List<Employee>list = new ArrayList<Employee>();
		//Given a list of Employee objects, fetch the names of all employees whose salary is greater than 50,000 and sort them by name.
		
		list.add(new Employee(1,"Sankha",50000.00));
		list.add(new Employee(2,"Subhra",150000.00));
		list.add(new Employee(3,"Datta",200000.00));
		
		List<String> filterEmployeeName = 
				
				list.stream().filter(e->e.getSalary()>50000.00)
						.map(e->e.getName())
						//.sorted()  Normal Sorting
						.sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()).reversed())
						.collect(Collectors.toList());
		
		System.out.println(filterEmployeeName.toString());
		
	}
}
