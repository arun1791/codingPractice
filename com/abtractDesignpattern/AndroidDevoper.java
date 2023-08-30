package com.abtractDesignpattern;

public class AndroidDevoper  implements  Employee{
    @Override
    public int getSalary() {
        System.out.println("this salary method ");
        return 50000;
    }

    @Override
    public String getName() {
        System.out.println("name is string arun pal");
        return "arun pal";
    }
}
