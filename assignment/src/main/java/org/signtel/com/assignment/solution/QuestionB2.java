package org.signtel.com.assignment.solution;

import org.signtel.com.assignment.model.Clownfish;
import org.signtel.com.assignment.model.Shark;

public class QuestionB2 {
	
	public static void main(String[] ags) {
		Shark shark = new Shark();
		shark.setColor();
		shark.setSize();
		shark.setEatFish();
		System.out.println("Shak Size:" + shark.getSize() + "  Color:" + shark.getColor() + "  EatFish:" + shark.isEatFish());

		Clownfish clownFish = new Clownfish();
		clownFish.setColor();
		clownFish.setSize();
		clownFish.setMakeJokes();
		System.out.println("Clownfish Size:" + clownFish.getSize() + "  Color:" + clownFish.getColor() + "  Makes Jokes:" + clownFish.isEatFish());
	}
	
	

}
