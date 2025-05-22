package com.ArrayProblems;

import java.util.Arrays;
import java.util.List;

public class MainABC {

	public static void main(String[] args) {
		
		
		int result = getresult(Arrays.asList(6,1,2,1),100);
		
		System.out.println(result);
	}

	private static int getresult(List<Integer> asList, int target) {
		// TODO Auto-generated method stub
		
		long sum=0;
		
		long result=0;
		
		for(int i =0;i<asList.size();i++) {
			
			sum=sum+asList.get(i);
			
			if(sum>target) {
				result=sum-target;
				return (int)result;
			}
		}
		
		result = target-sum;
		
		
		return  (int)result;
	}
}
