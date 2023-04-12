package com.oops;

public class Parent {

    //overridden method
    public  void  m1(){
        System.out.println("i am parent of child");
    }
}

class  Child extends  Parent
{

    //overridoing method
    public  void  m1()
    {
        System.out.println("i am m1 of child");
    }
}
