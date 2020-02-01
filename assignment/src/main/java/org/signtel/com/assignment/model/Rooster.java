package org.signtel.com.assignment.model;

/**
 * 
 * @author Wasim Akbar
 *
 */
public class Rooster extends Bird{
	
	Chicken chicken = new Chicken(); 
	
	public void sound() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	public void fly() {
		chicken.fly();
	}
}
