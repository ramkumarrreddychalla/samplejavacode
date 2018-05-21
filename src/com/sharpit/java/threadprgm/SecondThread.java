package com.sharpit.java.threadprgm;

import com.sharpit.java.modifiers.TestModifiers;

public class SecondThread extends TestModifiers implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondThread secondThread = new SecondThread();
		Thread t = new Thread(secondThread);
		t.start();
		
		SecondThread secondThread1 = new SecondThread();
		Thread t1 = new Thread(secondThread);
		t1.start();
		
		SecondThread secondThread2 = new SecondThread();
		Thread t2 = new Thread(secondThread);
		t2.start();
		
		SecondThread secondThread3 = new SecondThread();
		Thread t3 = new Thread(secondThread);
		t3.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread start");
		
	}

}
