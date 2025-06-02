package com.ArrayPractice;

import java.util.Arrays;

public class Problem7 {

	// Find the average of all elements
	public static void main(String[] args) {
		int arr[] = {1,5,6,7,3};
		
		double average = 0.0d;
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		average=(double)sum/arr.length;
		System.out.println(average);

		System.out.println( Arrays.stream(arr).average().getAsDouble() );
		
	}

}
