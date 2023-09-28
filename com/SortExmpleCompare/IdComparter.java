package com.SortExmpleCompare;

import java.util.Comparator;

import com.oops.emp;

public class IdComparter implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        // TODO Auto-generated method stub
            return o1.getEmpId()-o2.getEmpId();
        //throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }

    
}