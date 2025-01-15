package com.ArrayProblems;

import java.util.ArrayList;

public class Question6 {
//	Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.
//
//			Note: If no such array is possible then, return [-1].
//
//			Examples:
//
//			Input: arr[] = [1, 2, 3, 7, 5], target = 12
//			Output: [2, 4]
//			Explanation: The sum of elements from 2nd to 4th position is 12.
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 7, 5};
		System.out.println(subarraySum(arr,12));
	}

private static ArrayList<Integer> subarraySum(int[] arr, int target) {
    ArrayList<Integer>list = new ArrayList<>();
    
    int sum=0;
    int first=0;
    
    for(int i=0;i<arr.length;i++){
        
        sum = sum+arr[i];
            
        if(sum==target){
            list.add(first+1);
            list.add(i+1);
            break;
        }
                    
        if(sum>target){
            i=first;
            first++;
            sum=0;
        }
    }
    
    if(list.size()==0) list.add(-1);
    
    return list;
}
}
