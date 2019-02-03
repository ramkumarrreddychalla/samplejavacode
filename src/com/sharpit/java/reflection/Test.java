package com.sharpit.java.reflection;

class Simple{
	
	public void message() {
		System.out.println("hello world");
	}
	
}  

public class Test{  
  void printName(Object obj){  
	  Class c=obj.getClass();    
	  System.out.println(c.getName());  
  }  
  
  
  //Object
  
  public static void main(String args[]){  
	   //Simple s=new Simple();  
	   //Test t=new Test();  
	   ///t.printName(s);  
	  
	  String s = "123";
	  
	  String s2 = "123";

	  
	  String s3 = new String("1255553");
	  
	  System.out.println(s.hashCode());
	  System.out.println(s2.hashCode());
	  System.out.println(s3.hashCode());
	  
	  
	  
	  
	  
	   
	   
	
	   try {
		   Class c = Class.forName("com.sharpit.java.reflection.Simple");  // loading the class from classpath 
		   Simple s1=(Simple)c.newInstance();  // Simple s = new Simple();
		   s1.message();  
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  

	   
 }  
}  