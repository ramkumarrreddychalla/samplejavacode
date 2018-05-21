package com.sharpit.java.serialization;

import java.io.Serializable;  
public class Student implements Serializable{  
	 int id;  
	 transient String name;  
	 
	 transient String company="SSS IT Pvt Ltd";
	 public Student(int id, String name) {  
		  this.id = id;  
		  this.name = name;  
	 }  
}  