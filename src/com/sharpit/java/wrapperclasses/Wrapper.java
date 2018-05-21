package com.sharpit.java.wrapperclasses;

import java.util.List;
import java.util.ArrayList;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		Integer ab = a;
		
		//List<int> listints = new ArrayList<>();
		//List<Integer> listins = new ArrayList<>();
		// after 1.4
		List list = new ArrayList();
		list.add("2323");
		list.add(23);
		
		String firstvalue = (String)list.get(0);
		int secondval = (int)list.get(1);
		
		Integer.parseInt(s);
		Integer.valueOf(secondval);
		
		for(Object x : list) {
			
			System.out.println(x);
		}

		
		
		
		
		
		

	}

}
