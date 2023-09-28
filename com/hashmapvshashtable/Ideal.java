package io.github.jiangdequan;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Ideal {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101," arin");
        ht.put(102," vikas");
        ht.put(103," neha");
         System.out.println("hashtable exaxple 00000");
     for (Map.Entry s : ht.entrySet()) {
            System.out.println(s.getKey()+" "+s.getValue());
            
        }
        HashMap map=new HashMap<>();
        map.put(101," ajay");
        map.put(101," arin");
        map.put(102," vikas");
        map.put(103," neha");

         for (Map.Entry d : ht.entrySet()) {
            System.out.println(d.getKey()+" "+d.getValue());
            
        }

        
    }
     
    
}