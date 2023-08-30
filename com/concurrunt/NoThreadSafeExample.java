package com.concurrunt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NoThreadSafeExample {

    public static void main(String[] args) {
        List<String> list=new CopyOnWriteArrayList<>();
        list.add("fisrt ");
        list.add("second  ");
        list.add("thried ");
        list.add("fourths  ");
        list.add("fisrt ");
        list.add("fisrt ");
        list.add("fisrt ");

        Runnable t=()->{
//            thread 1- task
            for(String str:list)
            {
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //throw new RuntimeException(e);
                }
            }
        };
        Runnable t2=()->{
//            thread 2 -task
            list.add("new item");
            list.add("new item");
            list.add("new item");
            list.add("new item");
            list.add("new item");
            list.add("new item");
        };
        new Thread(t2).start();
        new Thread(t).start();
        new Thread(t2).start();

    }
}
