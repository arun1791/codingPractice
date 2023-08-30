package com.streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter

        List<String > names= List.of("Aman","Ankit","Abhinav","baabloo","neha");
        List<String> names1 = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(names1);
        //map
        
        
        List<Integer> numbers=List.of(12,25,45,64,5);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

//        names.stream().forEach(e->{
//            System.out.println(e);
//        });
//        names1.stream().forEach(System.out::println);

        numbers.stream().sorted().forEach(System.out::println);
        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min: "+integer);
        Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max : "+integer1);
    }
}
