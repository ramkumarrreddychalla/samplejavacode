package com.sharpit.java.innerclasses;

abstract class Person{
	  abstract void eat();
}

public class TestAnnonymousInner{
	
 public static void main(String args[]){
	  Person p=new Person(){
		     public void eat(){
		             System.out.println("inside anonymous");
		      }
	    };
	  p.eat();
 }
 
}

