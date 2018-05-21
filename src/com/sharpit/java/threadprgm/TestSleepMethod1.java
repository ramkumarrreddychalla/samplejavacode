package com.sharpit.java.threadprgm;

class TestSleepMethod1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<50;i++){  
	    try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(Thread.currentThread().getName()+ " Print value >>>> "+i);
	    System.out.println(" Priority >>> "+Thread.currentThread().getPriority());
	  }  
	 }  
	 public static void main(String args[]){  
	  TestSleepMethod1 t1=new TestSleepMethod1();  
	  TestSleepMethod1 t2=new TestSleepMethod1();  
	  
	  t1.setName(" Thread 1");
	  t1.setPriority(MIN_PRIORITY);
	  //t1.run();
	  t1.start(); 
	  
	  try{  
		  t1.join(100);  
		 }catch(Exception e){System.out.println(e);}  
	  
	  t2.setName(" Thread 2");
	  t2.setPriority(MAX_PRIORITY);
	  t2.start();
	  //t2.run();
	 }  
}  
