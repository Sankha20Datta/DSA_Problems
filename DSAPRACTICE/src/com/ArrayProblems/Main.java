package com.ArrayProblems;

import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 85));

        // Comparator for sorting by marks (Descending)
        Comparator<Student> marksComparator = (s1, s2) -> s2.marks - s1.marks;

        // Comparator for sorting by name (Ascending)
        Comparator<Student> nameComparator = Comparator.comparing(s -> s.name);
        Comparator<Student> nameLengthComparator = (s1,s2)-> s1.name.length()-s2.name.length();

        // Sorting by marks first, then by name
        students.sort(nameLengthComparator.thenComparing(marksComparator));

        System.out.println(students);
        // Output: [Bob - 90, Alice - 85, Charlie - 85] (Sorted by marks, then name)
    }
}
