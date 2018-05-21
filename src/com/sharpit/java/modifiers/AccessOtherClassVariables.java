package com.sharpit.java.modifiers;

public class AccessOtherClassVariables {

	public static void main(String[] args) {
		//print 20 if the given input is even
		// print 30 if the given input is odd
		
		// declaration  - of type
		// define       = is the value
		
		int i = 11;  //initialization -initializing the value of 11 to i
		if(i % 2 == 0) {
			System.out.println("20");
		}else {
			System.out.println("10");
		}
		
		
		//for loop
		// print 20 times or print 1 to 20
		
		//for(initialization; condition; increment or decrement)
		
		for(int j = 1; j <= 20; j++) {
			if(i == 15) break;
			System.out.println(" print "+j);
		}
		
		int k = 1;
		
		while( k <= 20 ) {
			if(k == 12) break;
			System.out.println(" print k "+(k++));
		}
		
		int l = 1;
		do {
			if(l == 10) break;
			System.out.println("Print L >>>> "+l);
			l++;
		}while(l <= 20);
		
		int [] numbers = {10, 20, 30, 40, 50};

	   System.out.println(numbers[0]);
       System.out.println(numbers[1]);
		
       for(int index = 0; index < numbers.length; index++) {
			System.out.println("index is "+index+ "and "+numbers[index]);
		}
		
		for (int val : numbers) {
			System.out.println(" and "+val);
		}
		
		//"12321" - polindrome
		
		//12321
		
		//raar
		
		//raar
		
		
		
	}

}
