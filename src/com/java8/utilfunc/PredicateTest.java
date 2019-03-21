package com.java8.utilfunc;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args){
        Predicate<String> isuserValid = u -> u!= null && u.length() > 5 && u.length() < 10;

        System.out.println(isuserValid.test("ranjith"));

        System.out.println(isuserValid.test("ranjith kumar"));
    }
}
