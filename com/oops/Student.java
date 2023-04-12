package com.oops;

public class Student {

    int student_id;
    String studentName;
    String studentCity;

    //behaviour memeber function

    public  void  study()
    {
        System.out.println(studentName+"-- is studying");
    }
    public  void  showfulldeatils()
    {
        System.out.println("my  name is +"+studentName);
        System.out.println("my  id is +"+student_id);
        System.out.println("my  City is +"+studentCity);

    }
}
