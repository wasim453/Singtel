package org.signtel.com.assignment.solution;

import org.signtel.com.assignment.model.Cat;
import org.signtel.com.assignment.model.Dog;
import org.signtel.com.assignment.model.Duck;
import org.signtel.com.assignment.model.Parrot;
import org.signtel.com.assignment.model.Rooster;

public class Question4 {

	public static void main(String [] ags) {
		Dog dog = new Dog();
		Parrot parrot1 = new Parrot(dog);
		parrot1.sound();
		Cat cat = new Cat();
		Parrot parrot2 = new Parrot(cat);
		parrot2.sound();
		Rooster rooster = new Rooster();
		Parrot parrot3 = new Parrot(rooster);
		parrot3.sound();
		Duck duck = new Duck();
		Parrot parrot4 = new Parrot(duck);
		parrot4.sound();
		
	}
}
