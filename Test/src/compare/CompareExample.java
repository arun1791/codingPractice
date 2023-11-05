package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareExample {

    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(12, "dts","test"));
       list.add(new Emp(1, "hari","test"));
       list.add(new Emp(6, "ashu","test"));
        System.out.println(list);
        Collections.sort(list,new NamCompartor());
        System.out.println(list);


    }
    
}