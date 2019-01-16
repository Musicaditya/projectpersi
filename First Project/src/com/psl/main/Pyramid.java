package com.psl.main;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		System.out.println();
		
		for(int i = 1;i <= (n/2)+1 ; i++){
			
			for(int j = 1 ; j <= (n/2)+1-i ; j++) {
				System.out.print(" ");
				
			}
			
			for(int k = 1; k <= ((2*i)-1) ; k++)
				System.out.print(2*i-1);
			System.out.println();
			
			
			
		}
	}

}
