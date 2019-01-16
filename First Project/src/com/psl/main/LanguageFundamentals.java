package com.psl.main;

import java.util.Arrays;

public class LanguageFundamentals {
	
	public static boolean isPrime( int n) {
		boolean p = false;
		for(int i = 2 ; i <= n ;i++) {
			
			if(n%i == 0) 
				return false;
			else 
				return true;
			
		}		
		return p;
	}
	public static int[] findPrime(int num) {
		
		
		int cnt = 0;
		
		for(int i = 0 ; i <= num ; i++) {
			
			if(isPrime(num)){
				cnt += 1;
		}
		}
		int[] arr = new int[cnt];
		
			int p = 0;
			
			for(int x = 1 ; x <= num ; x++) {
				if(isPrime(x)){
					arr[p] = x;
					p++;
				}
				
			}
				
		
		return arr;
		
	}
	
		


			public static void main (String[] args) {
				int[] arrn = findPrime(11);
			for(int i = 0 ; i <= arrn.length ;i++)
				System.out.println(arrn[i]);
				
			}

}