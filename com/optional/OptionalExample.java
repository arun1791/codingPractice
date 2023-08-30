package com.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str="arun";
//        if(str==null)
//        {
//            System.out.println(" this is null object");
//        }
//        else {
//            System.out.println(str.length());
//        }
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("nullvalue "));
    }
}
