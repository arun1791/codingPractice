package com.abtractDesignpattern;

public class EmployeeFactory {

    public  static  Employee getEmployee(EmployeeAbstracrt factory)
    {
            return  factory.createEmployee();
    }
}
