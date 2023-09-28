package com.HashMapVSConCuuruntHasmap;

import java.util.HashMap;

public class HashMapDemo extends Thread {

    static HashMap<Integer,String> map=new HashMap<>();

    public void run()
    {
        try{
            Thread.sleep(1000);
            map.put(3, "Arun");

        }
        catch(InterruptedException e)
        {
            System.out.println("chiled thread going to addd elements ");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        map.put(2, "ajit");
        map.put(1, "amar");
        map.put(4, "neha");
        HashMapDemo t=new HashMapDemo();
        t.start();

        for (Object  object : map.entrySet()) {
            System.out.println(object);
            Thread.sleep(1000);
            
            
        }
        System.out.println(map);
    }
    
}