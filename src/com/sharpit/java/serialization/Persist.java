package com.sharpit.java.serialization;

import java.io.*;  
class Persist{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("studentsr.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
  
  
  FileInputStream fin=new FileInputStream("studentsr.txt");  
  ObjectInputStream oin=new ObjectInputStream(fin);
  
  Student student = (Student) oin.readObject();
  
  System.out.println("read success fully name >> "+student.name+" and id >> "+student.id);
  System.out.println(student.company);
  
 }  
}  