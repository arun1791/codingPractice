package com.oops;

public abstract class MyClass {

    //Compltedt method
    public  void  cal()
    {
        System.out.println("Calluting results");
    }
    //abstract
   abstract public  void launchRocket();
}

class  Start
{
    public static void main(String[] args) {
       MyCheild myCheild=new MyCheild();
       myCheild.launchRocket();
       myCheild.cal();
    }
}