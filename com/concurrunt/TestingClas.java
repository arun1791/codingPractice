package com.concurrunt;

import java.util.function.Function;

public class TestingClas {
    public String data()
    {
        System.out.println("Testingreqired ");
        return  "Testingreqired";
    }
    public static void main(String[] args) {
        TestingClas t=new TestingClas();
        t.data();
        Function<String,Integer> lengthFunction= String::length;
        int length = lengthFunction.apply("Arun harilal  pal");
        System.out.println(length);

    }
}
