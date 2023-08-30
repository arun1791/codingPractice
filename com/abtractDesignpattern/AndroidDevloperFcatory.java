package com.abtractDesignpattern;

public class AndroidDevloperFcatory extends  EmployeeAbstracrt{
    @Override
    public Employee createEmployee() {
        return new AndroidDevoper();
    }
}
