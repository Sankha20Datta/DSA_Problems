package com.ArrayPractice;

import java.util.Arrays;

//Copy elements from one array to another
public class Problem6 {

	
	public static void main(String[] args) {
		
		int arr [] = {6,2,3,4,5};
		
		int arr1[] = new int[arr.length];
		
//		for(int i=0;i<arr.length;i++) {
//			arr1[i]=arr[i];
//		}
		
		System.arraycopy(arr,0,arr1,0,arr.length);
		
		System.out.println(Arrays.toString(arr1));
	}
}
