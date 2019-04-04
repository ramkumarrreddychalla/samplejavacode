package com.java8.utilfunc;

import com.java8.Student;

import java.util.function.Consumer;

public class ConsumerTest {
    Consumer<Student> studentConsumer = (s) -> System.out.println(s.getName()+ s.getAge());



}
