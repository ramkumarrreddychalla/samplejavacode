package com.sharpit.java.modifiers;

public class BitWiseOperations {
	
	public static void main(String[] args) {
		
		//var randInt:int = int(Math.random()*1000);
		
		int num1 = 37; //odd
		
		int num2 = 20; // even
		
		int result1 = num1 & 1;
		
		int result2 = num2 & 1;
		
		System.out.println("binary rep of  37            "+Integer.toBinaryString(37));
		System.out.println("binary rep of negative 37    "+Integer.toBinaryString(-37));
		System.out.println(Integer.toBinaryString(20));
		
		System.out.println(37+ -37);
		System.out.println(" DJDJDJD "+(37 & ~37));
		
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(result1==0 ? "even" : "odd");
		
		System.out.println(result2==0 ? "even" : "odd");
		
		
		if(num1 % 2 == 0) {
			System.out.println("Given Number is even");
		}
		
		
		if(num2 % 2 != 0) {
			System.out.println("Given Number is odd");
		}
		
		
		int yes = 1;
		int no = 2;
		int okay = 4;
		int cancel = 8;
				
		System.out.println(1 & yes);
		System.out.println(2 & yes);
		System.out.println(2 & okay);
		
		
		
		
		
		
		
		
//		100101
//	&1  000001
//	   =========
//	    000001 == 1 == this odd number
//	    
//	        10100
//		&1  00001
//		   =========
//		    00000 == 0 == this even number
		
//			37				00100101
//			
//		   -37				11011010  
//		 				(+)	00000001           
//2's complement (-37) =      11011011 
//						(+) 00100101
//							111	111
//                            ========
//                            0000000
					        
                           
		
//		37 & -37 = first conver plus 37 & find 2s complement for (-37) and apply & operator
		
		
		
		
	}

}
