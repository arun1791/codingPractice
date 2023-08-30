package com.abtractDesignpattern;

public class WebDevlopFactory extends EmployeeAbstracrt {
    @Override
    public Employee createEmployee() {
        return new WebDevloper();
    }
}
