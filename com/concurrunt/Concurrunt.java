package com.concurrunt;

public class Concurrunt {

    public   String getData()
    {
        return "Hi i am string data";
    }

    public static void main(String[] args) {
        Concurrunt concurrunt=new Concurrunt();
        //concurrunt.getData().toString();
        System.out.println(concurrunt.getData());
        //System.out.println(" this is best way coding ");

    }
}
