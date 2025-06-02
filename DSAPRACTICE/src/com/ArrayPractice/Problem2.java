package com.ArrayPractice;

import java.util.Arrays;

//Reverse an array.
public class Problem2 {

	public static void main(String[] args) {
		
		int [] arr = {1,4,5,6,2};
		
		arr = doReverseArray(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
		

	}

	private static int[] doReverseArray(int[] arr) {
		
		int i=0;
		int j= arr.length-1;
		
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
			
		}
		
		
		return arr;
	}

}
