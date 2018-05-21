package com.sharpit.java.exceptions;

import java.io.IOException;

public class TestThrow1 {

	void m() throws IOException {
	    throw new java.io.IOException("device error");//checked exception
	  }
	  void n(){
	   try{
	      m();
	    }catch(java.io.IOException EXP){
	          System.out.println("IO Excepton");
	    }
	  }
	  void p(){
	   try{
	    n();
	   }catch(Exception e){System.out.println("exception handeled");}
	  }
	  public static void main(String args[]){
		  TestThrow1 obj=new TestThrow1();
	   obj.p();
	   System.out.println("normal flow");
	  }

}
