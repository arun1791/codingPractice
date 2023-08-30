package com.CountSpaceUpperLower;

import java.util.Scanner;

public class CountSpaceUpperLower {

    public static void main(String[] args) {
        System.out.println(" enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        int count=0;
        int loercount=0 , uppercount=0, othercount=0;

        for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);

            if(Character.isWhitespace(ch))
            {
                count++;
                //space cunt
            } else if (Character.isLowerCase(ch)) {
                loercount++;
                //lower case count
            } else if (Character.isUpperCase(ch)){
                uppercount++;
                //upper case count
            }
            else {
                othercount++;
                //other count error
            }
        }
        System.out.println("space count: "+count);
        System.out.println("upper count: "+uppercount);
        System.out.println("lowe count: "+loercount);
        System.out.println("other count: "+othercount);
    }
}
