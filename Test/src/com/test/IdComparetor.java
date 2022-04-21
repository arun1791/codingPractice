package com.test;

import java.util.Comparator;

public class IdComparetor implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}

}
