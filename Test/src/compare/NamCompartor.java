package compare;

import java.util.Comparator;

public class NamCompartor implements Comparator<Emp>{

    @Override
    public int compare(Emp obj, Emp obj1) {
        // TODO Auto-generated method stub
       return obj.getName().compareTo(obj1.getName());
    }
    
}