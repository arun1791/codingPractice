package designPattern.singleToneDesign;

import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception{
        // new Samosa();
        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        //signtone design pattern break refeaction api
       Constructor<Samosa> constructor= Samosa.class.getDeclaredConstructor();
       constructor.setAccessible(true);
       Samosa s2=constructor.newInstance();
       System.out.println(s2.hashCode());


        // Samosa samosa1=Samosa.getSamosa();
        // System.out.println(samosa1.hashCode());

        // System.out.println(Jalebi.getJalebi().hashCode());
        // System.out.println(Jalebi.getJalebi().hashCode());


    }
    
}