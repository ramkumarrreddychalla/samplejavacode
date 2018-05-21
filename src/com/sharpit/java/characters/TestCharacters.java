package com.sharpit.java.characters;

public class TestCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(Character.isLetter('c'));
	      System.out.println(Character.isLetter('5'));
	      
	      System.out.println(Character.isLowerCase('5'));
	      System.out.println(Character.isLowerCase('c'));
	      System.out.println(Character.isLowerCase('C'));
	      System.out.println(Character.toLowerCase('C'));
	      System.out.println(Character.toUpperCase('c'));
	      
	      //char x = 'x';
	      
	      String str = "xyz ehldldldld kdkdkd ";
	      
	      //String str = 'xxxxxx';
	      
	      char[] chars = str.toCharArray();
	      
//	      int i = 0;
//	      for(char ch : chars) {
//	    	  System.out.println(" char at "+i+" is >>>"+ch);
//	    	  i++;
//	      }
//	      
	      
	      
//	      for(int j=0; j < chars.length; j++) {
//	    	  System.out.println(" char at "+j+" is >>>"+chars[j]);
//	      }
	      
	      String polindrome = "1234321"; // reverse a given input has to match the input
	      
	      char[] pols = polindrome.toCharArray();
	      
	      int[] intpols = {1,2,3,4,5,6};
	      String[] strings = new String[4];
	      String str1 = new String("djdjd");
	      String string = "GEKKIHDHDHDHDH KKJSFHSKJFHKSHF";
	      
	      
	    		  
	      
	      
	      int[] intpoGls = new int[4];
	      char[] chararray = new char[3];
	      
	      System.out.println("polyndrome is:");
	      for(int k = pols.length; k >0 ; k--) {  // k-- meaning k = k; k = k -1;
	    	  System.out.print(pols[k - 1]);
	      }
	      
	      
	      
	}

}
