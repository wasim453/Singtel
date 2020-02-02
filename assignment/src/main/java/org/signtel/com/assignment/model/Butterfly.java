package org.signtel.com.assignment.model;

/**
 * 
 * @author Wasim Akbar
 *
 */
public class Butterfly extends Catterpiller{

	@Override
	public void sound() {
		System.out.println("I can't make sound");
	}
	@Override
	public void fly() {
		System.out.println("I can fly");
	}

}
