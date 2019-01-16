package com.psl.main;

public class Salary {

	
	public static void main (String[] args) {
		
	double basicSalary = 2000;
	double DA = (basicSalary * 10/100);
	double HR = (basicSalary * 7/100);	
	double GS = (basicSalary + DA + HR);
	double IT = (GS * 8/100);
	double NS = (GS - IT);
	
		System.out.println("Dearnesss allowance is - " + DA);
		System.out.println("HR is - " +HR);
		System.out.println("Gross Salary is - " + GS);
		System.out.println("Income Tax is - " +IT);
		System.out.println("Net Salary is - " +NS);
		 
		
		
		
		
		
	}
}
