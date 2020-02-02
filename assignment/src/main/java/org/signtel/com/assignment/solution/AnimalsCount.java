package org.signtel.com.assignment.solution;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.signtel.com.assignment.model.Animal;
import org.signtel.com.assignment.model.Bird;
import org.signtel.com.assignment.model.Butterfly;
import org.signtel.com.assignment.model.Cat;
import org.signtel.com.assignment.model.Chicken;
import org.signtel.com.assignment.model.Dog;
import org.signtel.com.assignment.model.Duck;
import org.signtel.com.assignment.model.Rooster;

/**
 * 
 * @author Wasim Akbar
 *
 */
public class AnimalsCount {
	
	public static void main(String [] args) {
		// Need to Add all Animals and remove methods walk/fly/sing/swim in all animals who can't walk/fly/swim/sing.
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};
		
		int flyAnimals =0;
		int walkAnimals =0;
		int singAnimals =0;
		int swimAnimals =0;
		for (int i = 0; i < animals.length; i++) {
			Method[] methods = animals[i].getClass().getDeclaredMethods();
			if (Arrays.asList(methods).toString().contains("walk")) {
				walkAnimals++;
			}
			if(Arrays.asList(methods).toString().contains("fly")) {
				flyAnimals++;
			}
			if(Arrays.asList(methods).toString().contains("sing")) {
				singAnimals++;
			}
			if (Arrays.asList(methods).toString().contains("swim")) {
				swimAnimals++;
			}
		}
		
		System.out.println("Animals count who can walk ==>"+walkAnimals);
		System.out.println("Animals count who can fly ==>"+flyAnimals);
		System.out.println("Animals count who can swim ==>"+swimAnimals);
		System.out.println("Animals count who can sing ==>"+singAnimals);
		
	}

}
