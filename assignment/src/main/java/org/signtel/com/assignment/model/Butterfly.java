package org.signtel.com.assignment.model;

/**
 * 
 * @author Wasim Akbar
 *
 */
public class Butterfly implements Animal{

	@Override
	public void sound() {
		System.out.println("I can't make sound");
	}
	
	public void fly() {
		System.out.println("I can fly");
	}

}
