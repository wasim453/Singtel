package org.signtel.com.assignment.model;

/**
 * @author Wasim Akba
 *
 */
public class Shark extends Fish{	
	
	public void setSize() {
		 super.setSize("Large");	
	}
	
	public void setColor() {
		 super.setColor("Grey");	
	}
	
	public void setEatFish() {
		super.setEatFish(Boolean.TRUE);
	}

}
