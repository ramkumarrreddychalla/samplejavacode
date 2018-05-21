package com.sharpit.java.wrapperclasses;

public class Operation{  
	int data=50;  
	  
	Operation change(int data){  
		 
	   Operation op = new Operation();
	   op.data = data + 100;
		 
	   //this.data = data+100;//changes will be in the local variable only  
	   return op;
	 }  
	     
	 public static void main(String args[]){  
		 
		 System.out.println(args[0]);
		 System.out.println(args[1]);
		 System.out.println(args[2]);
		 
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   Operation data1 = op.change(500);  
	   
	   System.out.println("after change "+op.data);
	   
	   System.out.println("after change "+data1.data);  
	  
	 }  
}  
