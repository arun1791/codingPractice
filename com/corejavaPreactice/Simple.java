package com.corejavaPreactice;

public class Simple {

    static  int m=100;//static variable
    public void method()
    {
        int n=90;//local variable
    }

     static  public void   main(String[] args) {
        System.out.println("hello world");
        int data =50;//instance variable

        Class<Simple> c= Simple.class;
         System.out.println(c.getClassLoader());

    }
}
