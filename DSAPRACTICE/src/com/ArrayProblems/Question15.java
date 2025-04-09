package com.ArrayProblems;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	
	int id;

	String name;
	double salary;
	String department;
	
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
	
}




public class Question15 {

	public static void main(String[] args) {
		
	      List<Employee> employees = List.of(
	              new Employee(1, "Alice", 5000, "IT"),
	              new Employee(2, "Bob", 7000, "HR"),
	              new Employee(3, "Charlie", 6000, "IT"),
	              new Employee(4, "David", 4000, "Finance"),
	              new Employee(5, "Eve", 9000, "IT"),
	              new Employee(6, "Frank", 6000, "HR"),
	              new Employee(7, "Grace", 8000, "Finance")
	          );
				
	      
	      // filterList salary >6000
	      
	      List<Employee>emplIst1 = employees.stream().filter(e->e.salary>6000).collect(Collectors.toList());
	      
	      //System.out.println(emplIst1);
	      
	      
	      // Map function for EmployeeList Name
	      List<String>names = employees.stream().map(e->e.name).collect(Collectors.toList());
	      
	     // System.out.println(names);
				
	      
	      // flatMap -> flatten the Structure
	      
	      List<List<String>>words = List.of(
	    		  List.of("Java","Python"),
	    		  List.of("C++","JS")
	    		  );
	      
	      List<String>flattenMapWord= words.stream().flatMap(List::stream).toList();
	    		  
	     // System.out.println("flattenMapWord--> "+flattenMapWord);
	      
	      
	      List<Employee>sortedEmployees = employees.stream().sorted(Comparator.comparingDouble(e->e.salary)).collect(Collectors.toList());
		
	      

	      
	      List<Employee>top3Employees=employees.stream().
	    		  sorted(Comparator.comparingDouble(e->e.salary))
	    		  .skip(3)
	    		  .collect(Collectors.toList());
	      
	     // System.out.println("sortedEmployees -- >"+top3Employees);
	      
	      double totalsalary = employees.stream().map(e->e.salary).reduce(0.0,(n1,n2) ->  n1+n2);
	     // System.out.println("totalsalary -- >"+totalsalary);
	      
	     Map<Integer,String>mapEmp = employees.stream().collect(Collectors.toMap(e -> e.id, e -> e.name)); 
	   //  System.out.println(mapEmp.toString());
	     
	     Map<String,List<Employee>>mapEmployee = employees.stream().
	    		 									collect(Collectors.groupingBy(e->e.department));
	     
	        Map<Boolean, List<Employee>> partitionedEmployees = employees.stream()
	                .collect(Collectors.partitioningBy(emp -> emp.salary > 6000));
	       // System.out.println("Partitioned Employees: " + partitionedEmployees);
	        
	        
	        boolean anyDepartmentHR = employees.stream().anyMatch(e->e.department.equalsIgnoreCase("HR"));
	        boolean allDepartmentHR = employees.stream().allMatch(e->e.department.equalsIgnoreCase("HR"));
	        boolean noDepartmentHR = employees.stream().noneMatch(e->e.department.equalsIgnoreCase("BCCI"));
//	        System.out.println("anyDepartmentHR: " + anyDepartmentHR);
//	        System.out.println("allDepartmentHR: " + allDepartmentHR);
//	        System.out.println("noDepartmentHR: " + noDepartmentHR);
	        
	        // 12. Find First & Find Any
	        Optional<Employee> firstEmployee = employees.stream().findFirst();
	        Optional<Employee> anyEmployee = employees.stream().filter(e->e.salary==4000).findAny();
//	        System.out.println("First Employee: " + firstEmployee.orElse(null));
//	        System.out.println("Any Employee: " + anyEmployee.orElse(null));
	        
//	        List<Employee> processedEmployees = employees.stream()
//	                .peek(emp -> System.out.println("Before Filter: " + emp))
//	                .filter(emp -> emp.salary > 5000)
//	                .peek(emp -> System.out.println("After Filter: " + emp))
//	                .collect(Collectors.toList());
	         
	      //  System.out.println("processedEmployees"+processedEmployees);
	        
	        double totalSalaryParallel = employees.parallelStream()
	                .mapToDouble(emp -> emp.salary)
	                .sum();
	        System.out.println("Total Salary (Parallel): " + totalSalaryParallel);
	    
	}
}
