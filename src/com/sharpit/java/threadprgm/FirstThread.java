package com.sharpit.java.threadprgm;

public class FirstThread extends Thread{
	
	static int counter;
	
	String varString = "name";
	
	public void run() {
		System.out.println(" thread started Thread"+(counter++));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstThread firstThread = new FirstThread();
		//firstThread.run();
		firstThread.start();

	}

}
