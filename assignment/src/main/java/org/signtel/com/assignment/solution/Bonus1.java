package org.signtel.com.assignment.solution;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Wasim Akbar
 *
 */
public class Bonus1 {
	
	public static void main(String [] ags) {		
		// Need to add county wise Resource Bundle Properties and read sound from there
		ResourceBundle languageBundle = ResourceBundle.getBundle("RoosteSound");
		System.out.println("Rooster Sound in default Language " + languageBundle.getString("RoosteSound"));
		
		Locale.setDefault(new Locale("urdu", "PK"));
		System.out.println("Current Locale: " + Locale.getDefault());
		languageBundle = ResourceBundle.getBundle("RoosteSound");
		System.out.println("Rooster Sound in default Language " + languageBundle.getString("RoosteSound"));
		
	}

}
