package com.abtractDesignpattern;

public class ManagerFactory extends EmployeeAbstracrt{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
