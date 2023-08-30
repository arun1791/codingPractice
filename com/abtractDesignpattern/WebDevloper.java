package com.abtractDesignpattern;

public class WebDevloper implements  Employee{
    @Override
    public int getSalary() {
        System.out.println("this webdeblper salary");
        return 500;
    }

    @Override
    public String getName() {
        System.out.println(" this weband");
        return "Web-Devloper";
    }
}
