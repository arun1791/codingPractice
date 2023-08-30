package com.Lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        // first thread
        Runnable thead=()->{
            //this is body of thread
            for(int i =0;i<=10;i++)
            {
                System.out.println("value if i "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t=new Thread(thead);
        t.setName("Areun");
        t.start();

        Runnable t2=()->{

            try {
                for(int i=1;i<=10;i++){
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        };

        Thread t22=new Thread(t2);
        t22.start();

    }
}
