package org.signtel.com.assignment.model;

/**
 * 
 * @author Wasim Akba
 *
 */

public interface Animal {
	public default void walk(){
		System.out.println("I am walking");
	}
	
	abstract void sound() ;
}
