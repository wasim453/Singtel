package org.signtel.com.assignment.model;

/**
 * 
 * @author Wasim Akbar
 *
 */
public class Catterpiller implements Animal {
	
	@Override
	public  void walk(){
		System.out.println("I can walk(Crawl)");
	}
	
	@Override	
	public void sound() {
	}
	
	public void fly() {
		System.out.println("I can not fly");
	}
}
