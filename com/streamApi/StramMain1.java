package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramMain1 {
    public static void main(String[] args) {
        //Create a list and
        List<Integer> list1 = List.of(2, 4, 5, 674, 2,455,78);
       // System.out.println(list1);
        List<Integer>list2=new ArrayList<>();
        list2.add(15);
        list2.add(30);
        list2.add(40);
        list2.add(45);

        List<Integer> list23 = Arrays.asList(12, 45, 78, 45);

       // System.out.println(list23);
        //without straem
        List<Integer>listeven=new ArrayList<>();
        for (Integer i:list1) {
            if(i%2==0)
            {
                listeven.add(i);
            }
            
        }
        System.out.println(list1);
        System.out.println(listeven);

        //using stream api
//        Stream<Integer>stream=list1.stream();
//        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList1);

        List<Integer> newList3 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList3);



    }
}
