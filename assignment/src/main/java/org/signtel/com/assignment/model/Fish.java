package org.signtel.com.assignment.model;
/**
 * 
 * @author Wasim Akbar
 *
 */
public class Fish {

	private String size;
	private String color;
	private boolean isMakeJokes;
	private boolean isEatFish;

	public void sing() {
		System.out.println("I dont sing");
	}

	public void walk() {
		System.out.println("I dont walk");
	}

	public void swim() {
		System.out.println("I can swim");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMakeJokes() {
		return isMakeJokes;
	}

	public void setMakeJokes(boolean isMakeJokes) {
		this.isMakeJokes = isMakeJokes;
	}

	public boolean isEatFish() {
		return isEatFish;
	}

	public void setEatFish(boolean isEatFish) {
		this.isEatFish = isEatFish;
	}
	
	
}
