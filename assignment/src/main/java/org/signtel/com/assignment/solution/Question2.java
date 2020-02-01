package org.signtel.com.assignment.solution;

import org.signtel.com.assignment.model.Chicken;
import org.signtel.com.assignment.model.Duck;

public class Question2 {
	
	public static void main(String [] ags) {
		Duck duck = new Duck();
		duck.sound();
		duck.swim();
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.fly();
	}

}
