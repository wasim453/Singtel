package org.signtel.com.assignment.model;

public class Chicken extends Bird{	
	
	public void sound() {
		System.out.println("Cluck, cluck”");
	}
	
	@Override
	public void fly() {
		System.out.println("I can not fly");
	}

}
