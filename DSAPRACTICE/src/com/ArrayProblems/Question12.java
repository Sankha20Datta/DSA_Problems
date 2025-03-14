package com.ArrayProblems;

import java.util.ArrayList;

public class Question12 {
	
	// search there are unique charcters are not in a string 
public static void main(String[] args) {
	
	
	//String name="Amrita";
	
	int []maiarray= {1,3,4,5,7,81,1,2,3}; 
	
	System.out.println(isUnique(maiarray));
}

	private static boolean isUnique(int[] maiarray) {
		ArrayList<Boolean>list= new ArrayList<>(maiarray.length);
		
		boolean arr[] = new boolean[maiarray.length];
		
		for(int i=0;i<maiarray.length;i++) {
			int val = 0;
		}
		
		
		return true;
	}

//	private static boolean isUnique(String name) {
//		
//		
//		if(name.length()>128) return false;
//		
//		boolean [] str = new boolean[128];
//		
//		for(int i=0;i<name.length();i++) {
//			
//			int val = name.charAt(i);
//			
//			System.out.println(val);
//			
//			if(str[val]) {
//				return false;
//			}
//			
//			str[val]= true;
//		}
//		
//		
//		return true;
//	}


}
