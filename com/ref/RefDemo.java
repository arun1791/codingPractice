package com.ref;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println(" learing method referncinfg ");
        //static method refer kiya hai
        Workinter workinter=Stuff::doStuff;

//                ()->{
//            System.out.println(" this is calling interface");
//
//        };
            workinter.doTask();
    }
}
