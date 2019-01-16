package com.learnToDrive.model;
/*
 * entity
 * model
 * javaBean
 */
public class Car {
	/* data members
	* attributes
	* properties
	* instance variables */
	
	private String make, model, color;
	
	/*
	 * no arg constructor/ no parm constructor
	 */
	
	public Car() {
		
		make = model= make ="";
	}

	/*
	 * member methods
	 * instance methods
	 * accessors
	 */
	public String getMake() {
		return make;
	}
 /*
  * mutator
  */
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
