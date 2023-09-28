package designPattern.singleToneDesign;

public class Samosa {

   

    // INSTANCE

    private static Samosa samosa;
    //Construitor
    private Samosa()
    {
        if(samosa!=null)
        {
            throw new RuntimeException("you are trying to break signtone design pattern ");
        }
        System.out.println(" this is construotr ");
    }

    // thread sefty not using synchroized
    public  static Samosa getSamosa()
    {
        //bject of 
            // Samosa samosa =new Samosa();
            if(samosa==null)
            {
                synchronized(Samosa.class){
                     if(samosa==null)
            {
                    samosa=new Samosa();
            }

                }
            }
            return samosa;
        

    }
    
}