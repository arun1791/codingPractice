package com.designPattern;

import java.awt.*;
import java.lang.reflect.Constructor;


public class Example {

    public static void main(String[] args) {
//        new Samosa();
//        Samosa samosa=Samosa.getSamosha();
//        System.out.println(samosa.hashCode());
//        Samosa samosa1=Samosa.getSamosha();
//        System.out.println(samosa1.hashCode());
//
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());

        //refeaction api
        Samosa s1=Samosa.getSamosha();
        System.out.println(s1.hashCode());


    }
}
