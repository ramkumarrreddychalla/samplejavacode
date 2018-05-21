package com.sharpit.java.modifiers;

public class TestModifiers {
	
	int rollNo; // default access modifier
	static int noofstudents; // class level variable
	
	/*
	 * different variables and types 
	 * instance, static (class) & local variable
	 * modifiers can control the access to the declared varaibles
	 * private, protected and public , default ( there is not key word)
	 */

	public static void main(String args[]) {
	      boolean a = false;
	      boolean b = true;

	      System.out.println("a && b = " + (a&&b));
	      System.out.println("a || b = " + (a||b) );
	      System.out.println("!(a && b) = " + !(a && b));
	      
	      System.out.println(!a);
	      
	      
	   }

}
