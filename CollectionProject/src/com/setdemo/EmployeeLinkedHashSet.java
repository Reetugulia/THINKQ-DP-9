package com.setdemo;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Employee> hs=new LinkedHashSet<>();
		hs.add(new Employee(1, "reetu", 50000));
		hs.add(new Employee(2, "arpita", 45000));
		hs.add(new Employee(3, "pranay", 45000));
		hs.add(new Employee(1, "reetu", 45000));
		hs.add(new Employee(4, "prachi", 47000));
		for(Employee e:hs)
		{
			System.out.println(e);
		}
	}

}
