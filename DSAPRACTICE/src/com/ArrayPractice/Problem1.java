package com.ArrayPractice;

import java.util.Arrays;

//Find the maximum and minimum element in an array
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,7,2,4};
		int arr1 [] = {};
				
		System.out.println("Minimum - "+  getMinimum(arr));
		
		System.out.println("maximum - "+getMaximum(arr1));
		
//		Arrays.stream(arr).max().orElse(0); if you are not sure arr will be empty or not
//		Arrays.stream(arr).min().orElse(0);
		
//		int max = Arrays.stream(arr).max().getAsInt();  // if you are sure arr is not empty
//		int min = Arrays.stream(arr).min().getAsInt();

	}

	private static int getMaximum(int[]arr) {
		
		if(arr==null|| arr.length==0) {
			throw new IllegalArgumentException("Array Can not be empty !");
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		
		return max;
	}

	private static int getMinimum(int [] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i:arr) {
			if(i<min)  min=i;
		}
		
		return min;
	}

}
