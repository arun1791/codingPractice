package com.Lambda;

public class Main {

    public static void main(String[] args) {
        System.out.println(" My System start...");
//        MyInterImpl myInter = new MyInterImpl();
//        myInter.sayHello();

//        MyInter i=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println(" this is first anaumous class");
//            }
//        };
//        i.sayHello();
//
//        MyInter i2=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println(" this is secomnd ananaymos class");
//            }
//        };
//        i2.sayHello();

        //lamda exaperssion

        MyInter i=()->
            System.out.println(" this is first trime lamda ");

        i.sayHello();

        MyInter i2=()->{
            System.out.println(" this is second tim eusing lamda ");
        };
        i2.sayHello();

//        SumInter sumInter=(int a, int b)-> {
//            return  a + b;
//        };
        SumInter sumInter=( a,  b)-> a + b;

        System.out.println( sumInter.sum(2,6));
        System.out.println( sumInter.sum(7,8));

        LengthIntr lengthIntr=str -> str.length();

        System.out.println(lengthIntr.getLeangth("arun pal"));

    }
}
