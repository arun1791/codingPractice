package com.designPattern;

public class Samosa {
    //constrtor
   private  static Samosa samosa;
    private  Samosa()
    {

    }

    public   static Samosa getSamosha()
    {
        //object of this calss
       if(samosa==null){
            synchronized (Samosa.class)
            {
                if(samosa==null){
                    samosa=new Samosa();
                }
            }
       }
        return  samosa;
    }
}
