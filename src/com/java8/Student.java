package com.java8;

import com.java8.comparator.School;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private long homeDistance;
    private double weight;
    private School school;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getHomeDistance() {
        return homeDistance;
    }

    public void setHomeDistance(long homeDistance) {
        this.homeDistance = homeDistance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
    @Override
    public String toString(){
        return name + "-" + age;
    }

    public Student(String name, int age, long homeDistance, double weight, School school) {
        this.name = name;
        this.age = age;
        this.homeDistance = homeDistance;
        this.weight = weight;
        this.school = school;
    }


    public static List<Student> getStudentList() {
        Student s1 = new Student("Ram", 18, 3455, 60.75, new School("AB College", "Noida"));
        Student s2 = new Student("Shyam", 22, 3252, 65.80, new School("RS College", "Gurugram"));
        Student s3 = new Student("Mohan", 18, 1459, 65.20, new School("AB College", "Noida"));
        Student s4 = new Student("Mahesh", 22, 4450, 70.25, new School("RS College", "Gurugram"));
        List<Student> list = Arrays.asList(s1, s2, s3, s4);
        return list;
    }
}
