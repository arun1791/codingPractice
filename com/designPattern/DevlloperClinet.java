package com.designPattern;

import java.util.Objects;

public class DevlloperClinet {
    public static void main(String[] args) {
//        Employee employee=new Andriord();
        //factory desigmn patter
        Employee employee=EmployeeFactory.getEmpolyee("ANDROID");
        int salary=Objects.requireNonNull(employee).getSalary();
        System.out.println(salary);
    }
}
