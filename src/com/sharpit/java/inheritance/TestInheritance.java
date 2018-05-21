package com.sharpit.java.inheritance;

public class TestInheritance {
	
	static AgregationClass agClass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parent p = new Parent();
		//p.print();
		
		SubClass sub = new SubClass();
		sub.print();
		
	    Parent p1 = new SubClass();
	    p1.print();
	    
	    
	    //Aggregation
	    
	    agClass = new AgregationClass();
	    agClass.print();
	    

	}

}
