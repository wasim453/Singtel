package org.signtel.com.assignment.model;

public class Parrot {
	
	private Object parrotSoundObj;
	
	public Parrot(Object object) {
		this.parrotSoundObj =object;
		System.out.println("Parrot Living near => "+object.getClass().getName());
	}

	public Object getParrotSoundObj() {
		return parrotSoundObj;
	}

	public void setParrotSoundObj(Object parrotSoundObj) {
		this.parrotSoundObj = parrotSoundObj;
		
	}
	
	public void sound() {
		if(parrotSoundObj instanceof Animal) {
			((Animal)parrotSoundObj).sound();
		}else{
			System.out.println("Phone Bell");
		}
	}

}
