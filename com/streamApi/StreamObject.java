package com.streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamObject {
    public static void main(String[] args) {
        //Stream Api -collection
        //collection / group ogf object
        Stream<Object> emptyStream = Stream.empty();
       String names[]={"Arun","Ankit","Rahul","Sunita"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
        //
        Stream<Object> streamBuilder = Stream.builder().build();

        //3
        IntStream stream12 = Arrays.stream(new int[]{2, 52, 45, 78});
        stream12.forEach(e->{
            System.out.println(e);
        });
    }
}
