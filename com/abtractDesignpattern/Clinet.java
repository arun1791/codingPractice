package com.abtractDesignpattern;

public class Clinet {

    public static void main(String[] args) {
        //i want top gte android devopwert

        Employee e1=EmployeeFactory.getEmployee(new AndroidDevloperFcatory());
        int slary=e1.getSalary();
        System.out.println(slary);

        Employee e2=EmployeeFactory.getEmployee(new WebDevlopFactory());
        int salar=e2.getSalary();
        System.out.println(salar);

        Employee e3=EmployeeFactory.getEmployee(new ManagerFactory());
        int salary=e3.getSalary();
        System.out.println("thisis"+salary);
    }
}
