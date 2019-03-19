package com.java8.mapnflatmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMapnFlatmap {

    public static void main(String args[]) throws IOException {
        String[] stringArray = {"Tom", "Jack", "Harry"};
        Stream<String> arraystream = Stream.of(stringArray);
        Stream<String> arraystream1 = Stream.of(stringArray);
        Stream<String> arraystream2 = Stream.of(stringArray);

        Stream<String> arraystream3 = Stream.of(stringArray);

        arraystream.map(s -> s.length()).forEach(s -> System.out.println(s));

        arraystream1.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        arraystream2.map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));

        arraystream3.map(s -> s.toLowerCase().concat("flatmap")).forEach(s -> System.out.println(s));

        String setofwords = "a boy on the hill living " +
                "on the earth and swim in the ocean and run" +
                "onto the road etc";


        Arrays.stream(setofwords.split("\\s+")).map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));

        Arrays.stream(setofwords.split("\\s+")).map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));


        Path path = Paths.get("/Users/Move Guest/ram/examples/samplejavacode/alice.txt");
        Files.lines(path).map(s -> s.split("\\s+")).map(Arrays::stream).forEach(System.out::println);

        Files.lines(path).map(s -> s.split("\\s+")).flatMap(Arrays::stream).forEach(System.out::println);

        Set<String> stringSets = new HashSet<>();

        //System.out.println(Files.lines(path).map(s -> s.split("\\s+")).flatMap(Arrays::stream).map(s -> stringSets.add(s)));

        System.out.println(Files.lines(path).map(s -> s.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toSet()));
        System.out.println(Files.lines(path).map(s -> s.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toList()));
        Files.lines(path).map(s -> s.split("\\s+")).flatMap(Arrays::stream).filter(s -> !s.isEmpty()).map(s ->  s.toLowerCase()).forEach(System.out::println);

        //;forEach(s -> stringSets.add(s)));

        System.out.println("size >>> "+ stringSets.size());



    }
}
