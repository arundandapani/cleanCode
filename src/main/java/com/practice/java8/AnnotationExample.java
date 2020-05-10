package com.practice.java8;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AnnotationExample {

    public static void main(String[] args){
        AnnotationExample ae = new AnnotationExample();
        List<String> s = ae.stringExample(null);
       // System.out.println(s.charAt(1));
    }



    public List<String> stringExample(@NotNull String somevalue){
        List<String> exampleList = new ArrayList<>();
        exampleList.add(somevalue);
        return exampleList;
    }
}
