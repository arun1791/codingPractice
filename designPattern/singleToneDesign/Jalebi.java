package designPattern.singleToneDesign;

public class Jalebi {

    private static Jalebi jalebi =new Jalebi();

    public static Jalebi getJalebi()
    {
            return jalebi;
    }
    
}