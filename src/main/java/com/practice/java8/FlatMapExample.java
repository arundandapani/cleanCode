package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args){
        FlatMapExample flatMapExample = new FlatMapExample();
        flatMapExample.demo();
    }

    public void demo(){
        List<String> example = Arrays.asList("12.1", "14.1");
        example.stream()
                .flatMap(obj -> Stream.of(obj.charAt(2)))
               // .map(obj -> obj + "Arun")
                .forEach(System.out::println);

        String myTwoDimensionalStringArray[][] = {{"Apple", "Banana"}, {"Pork", "Beef", "Chicken"}, {"Carrots"} };
        List<List<String>> asList = new ArrayList<>();
        for(String[] eachArray : myTwoDimensionalStringArray){
            asList.add(Arrays.asList(eachArray));
        }
        asList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);

        asList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);


    }
}
