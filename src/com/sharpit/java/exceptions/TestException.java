package com.sharpit.java.exceptions;

import java.io.File;
import java.io.IOException;

class xyz{
	
}


public class TestException {

	class abc{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File xyz = null;
		try {
			/// file operation
			// open a file read file 
			
			xyz = new File("path");
			xyz.getName(); // null pointer exception
			
		}
		finally {
			
			xyz = null;
			// close all the refernces / connections/ 
			// any object that was created in try block
		}

	}

}
