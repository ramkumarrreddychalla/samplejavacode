package com.sharpit.java.threadprgm;

public class TestDaemonThread1 extends Thread{  
	
	 static int counter = 0;
	 public void run(){ 
		 
		 counter ++;
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread 
			  System.out.println("daemon thread work");
			  
			 
			  
			  
			  //System.exit(0);
		  }  
		  else{  
			  System.out.println("Counter value >>> "+counter+" & Name >>> "+Thread.currentThread().getName()+" exit ");
			 
			  if(counter == 2) {
				  System.out.println("Counter value >>> "+counter+" & Name >>> "+Thread.currentThread().getName()+" exit ");
				  return;
			  }
		 }  
	 }  
	 public static void main(String[] args){  
	  TestDaemonThread1 t1=new TestDaemonThread1();//creating thread  
	  TestDaemonThread1 t2=new TestDaemonThread1();  
	  TestDaemonThread1 t3=new TestDaemonThread1();  
	  
	  //t1.setDaemon(true);//now t1 is daemon thread  
	  t1.setName("Thread 1");  
	  t1.start();//starting threads
	  t2.setName("Thread 2");  
	  t2.start();
	  t3.setName("Thread 3");
	  t3.start();  
	  
	  //t1.stop();
	  //t1.suspend();
	  
	  
	 }  
}  
