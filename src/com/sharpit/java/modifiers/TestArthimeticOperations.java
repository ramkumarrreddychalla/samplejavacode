package com.sharpit.java.modifiers;

public class TestArthimeticOperations {
  
	  public static void main(String args[]) {
		  int a, b = 0;
		  
		  System.out.println(b);
	      a = 10;
	      b = (a == 1) ? 20: 40;
	      System.out.println( "Value of b is : " +  b );

	      b = (a == 10) ? 20: 30;
	      System.out.println( "Value of b is : " + b );
	      
	      
	      TestArthimeticOperations test = new TestArthimeticOperations();
	      
	      boolean result =  test instanceof TestArthimeticOperations;
	      
	      System.out.println(result);
	      
	      System.out.println(2 * (10 + 5)); //precedence * and +
	      
	      int z = 2, x = 10;
	      System.out.println(z++); // ++ means x = x
	                               // x = x + 1;
	      System.out.println(++x); // x = x+1
	      
	      System.out.println(z--); // z-- z = z;
	                               // z = z - 1
	      System.out.println(--x); // x = x-1
	   }
 }
