package com.java8.utilfunc;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args){
        Supplier<String> stringSupplier = () -> "hello world";
        System.out.println(" supplier get "+stringSupplier.get());
    }
}
