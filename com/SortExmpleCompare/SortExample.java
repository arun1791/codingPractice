package com.SortExmpleCompare;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

    public static void main(String[] args) {
        ArrayList<Emp> marks=new ArrayList<>();
        marks.add(new Emp("Arun", "9096032655", 5));
        marks.add(new Emp("Arya", "90960mn", 6));
        marks.add(new Emp("Adndn", "90960jmm", 4));
        marks.add(new Emp("neha", "90960355", 1));
        
        System.out.println(marks);
        Collections.sort(marks,new IdComparter());
        System.out.println(marks);


    }
    
}