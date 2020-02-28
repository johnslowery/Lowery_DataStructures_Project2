/**
 * The Country class is mainly used to assist the Project1 class. Country has all the getters and setters for each different country field
 * (Name, Code, Capitol, Population, GDP, and Happiness Rank), as well as a constructor in order to make and use Country type objects
 * and arrays. It also has a method to compare two Country objects and print a Country object.
 * 
 * @author John Lowery
 * @version 2/22/2020 
 */

import java.util.Scanner;

public class Country {

	static String name;
	static String code;
	static String capitol;
	static int pop;
	static double gdp;
	static String happy;

	/**
	 * The Country constructor allows fileParse to run the various elements of the CVS file into it so they can be put into a Country type array
	 */
	
	public Country() {}
	
	/**
	 * getName is the getter for country Names
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * setName is the setter for country Names
	 * 
	 * @param newName: helps to set name
	 */
	
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * getCode is the getter for country Codes
	 */
	
	public String getCode() {
		return code;
	}
	
	/**
	 * setCode is the setter for country Codes
	 * 
	 * @param newCode: helps to set code
	 */
	
	public void setCode(String newCode) {
		code = newCode;
	}
	
	/**
	 * getCapitol is the getter for country Capitols
	 */
	
	public String getCapitol() {
		return capitol;
	}
	
	/**
	 * setCapitol is the setter for country Capitols
	 * 
	 * @param newCapitol: helps to set capitol
	 */
	
	public void setCapitol(String newCapitol) {
		capitol = newCapitol;
	}
	
	/**
	 * getPop is the getter for country Populations
	 */
	
	public int getPop() {
		return pop;
	}
	
	/**
	 * setPop is the setter for country Populations
	 * 
	 * @param newPop: helps to set pop
	 */
	
	public void setPop(int newPop) {
		pop = newPop;
	}
	
	/**
	 * getGDP is the getter for country GDP's
	 */
	
	public double getGDP() {
		return gdp;
	}
	
	/**
	 * setGDP is the setter for country GDP's
	 * 
	 * @param newGDP: helps to set gdp
	 */
	
	public void setGDP(double d) {
		gdp = d;
	}
	
	/**
	 * getHapp is the getter for country Happiness Ranks
	 */
	
	public String getHapp() {
		return happy;
	}
	
	/**
	 * setHapp is the setter for country Happiness Ranks
	 * 
	 * @param newHappy: helps to set happy
	 */
	
	public void setHapp(String newHappy) {
		happy = newHappy;
	}
	
	/*
	 * compareName compares two given Country objects by name
	 * 
	 * @param x: first country object to be compared
	 * @param y: second country object to be compared
	 */
	
	/*public static void compareName(Country x, Country y) {
		int compare = x.getName().compareTo(y.getName());
		if(compare == 0) {
			System.out.println("They are the same");
		}else {
			System.out.println("They are different");
		}
	}*/
	
	/*
	 * printCountry prints a specified Country object
	 * 
	 * @param x: the Country object that gets printed
	 */
	
	public static void printCountry(Country x) {
		System.out.println(x);
	}
}