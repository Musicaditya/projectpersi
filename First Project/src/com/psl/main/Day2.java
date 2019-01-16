package com.psl.main;

import java.awt.DisplayMode;

public class Day2 {

	public static boolean findElement(int[] arr,int num) {
		
	
		
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			
			if(arr[i] == num) {
				return true;
			}
			
		}
			return false;
	}
	
	public static int[] sortedArray(int[] arr) {
		int temp = 0;
		
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length-1 ; j++) {
				
				if(arr[j]  > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					
				}
			}
			
		}
		
		return arr;
	}
	
	
	
	
	public static int [][] displayTable() {
		
		int[][] brr = new int[13][13];
	
		
		for( int i = 0 ; i<13 ; i++) {
			
			for(int j=0 ; j< 13 ;j++) {
				brr[i][j] = (i+1)*(j+1);
			}
			
			
		}
		return brr;
		
		
	}
	
	
	public static String reversedString(String str) {
		
		
		String[] words = str.split(" ");
		String reverseString = "";
		
		for(int i = 0; i < words.length;i++) {
			
			String word = words[i];
			
			String reverseword = "";
			
			for(int j = word.length()-1 ; j >= 0 ; j-- ) {
				reverseword = reverseword + word.charAt(j);
				
			}
				reverseString = reverseString + reverseword + " ";
			
	}
		return reverseString;
		
		
	} 
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {20,30,21,45,69,89,12,4,74,8,96};
		
		
		//System.out.println(findElement(arr,4));
		
		//int[] brr = sortedArray(arr);
		
		//for (int i = 0; i< arr.length;i++) {
		//	System.out.print(brr[i] +" " );
		//}
		
	/*int[][] tab = displayTable();
		
		
		for( int i = 0 ; i<tab.length ; i++) {
			for(int j=0 ; j< tab.length ;j++) {
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
			
			
		}
		*/
		System.out.println(reversedString("This is aditya vyas"));
		
	}
	
	
	
}
