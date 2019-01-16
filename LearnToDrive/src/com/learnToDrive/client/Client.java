package com.learnToDrive.client;

import com.learnToDrive.model.Car;

public class Client {

	public static void main(String[] args) {
	
		Car xuv, baleno;
		
		 xuv = new Car();
		 
		 xuv.setMake("Mahindra");
		 xuv.setModel("XUV 100");
		 xuv.setColor("Black");
		 
		 System.out.println(xuv.getColor());
		 System.out.println(xuv.getMake());
		 System.out.println(xuv.getModel());
		 
		 
		 
		 
		 baleno = new Car();
		 
		 baleno.setColor("Red");
		 baleno.setMake("Maruti");
		 baleno.setModel("baleno rs");
		 
		 System.out.println(baleno.getColor());
		 System.out.println(baleno.getMake());
		 System.out.println(baleno.getModel());
		 
		 
		 
		 

	}

}
