package com.abtractDesignpattern;

public class Manager implements  Employee{
    @Override
    public int getSalary() {
        return 100000;
    }

    @Override
    public String getName() {
        System.out.println("this is my manager");
        return "I am new mannager";
    }
}
