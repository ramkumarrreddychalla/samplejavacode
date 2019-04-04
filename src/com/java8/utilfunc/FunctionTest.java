package com.java8.utilfunc;

import com.java8.Student;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String [] args){
        Function<Student, String> funcStudent = s -> "hello there "+s.getName();
        Student student = new Student("ram", 10);
        student.setName("school");
        System.out.println(funcStudent.apply(student));
    }
}
