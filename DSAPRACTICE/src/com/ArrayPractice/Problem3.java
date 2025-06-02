package com.ArrayPractice;

import java.util.Arrays;

//3. Find the sum of all elements in an array
public class Problem3 {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		int arr1[] = {};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum);
		System.out.println("sum with Strem API "+ Arrays.stream(arr1).sum());
	}
}
