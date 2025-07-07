package com.javapractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    // Constructor, getters, and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
    
}
public class Q28 {

	
	
	public static void main(String[] args) {
		
		
		List<Person> people = List.of(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 25)
			);
		
		
		
		Map<Integer,List<Person>>map=people.stream().collect(Collectors.groupingBy(Person::getAge));
		
		System.out.println(map);
	}
}
