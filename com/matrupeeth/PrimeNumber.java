package com.matrupeeth;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int n,m=0,count=0;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n/2;
        if(n==0||m==1)
        {
            System.out.println("this is not prime ");
        }
        else
        {
            for(int i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+"this is not prime");
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(n+"This is prime number");
            }
        }

    }

}
