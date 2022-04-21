package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ShortCompare {

	public static void main(String[] args) {
		
		ArrayList<Emp> emp =new ArrayList<>();
		emp.add(new Emp("arun", "123456", 45));
		emp.add(new Emp("adesh ", "789456", 12));
		emp.add(new Emp("Rishi", "45454545454", 65));
		
		//compareable
		Collections.sort(emp,new IdComparetor());
		System.out.println(emp);
		
	}

}
