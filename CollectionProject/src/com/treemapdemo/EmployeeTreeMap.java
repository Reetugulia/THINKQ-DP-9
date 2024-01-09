package com.treemapdemo;

import java.util.TreeMap;

public class EmployeeTreeMap {
	public static void main(String[] args) {
		TreeMap<Employee,String> tmap=new TreeMap<Employee, String>();
		tmap.put(new Employee(103, "reetu", 50000), "IT");
		tmap.put(new Employee(102, "riya", 55000), "HR");
		tmap.put(new Employee(104, "arpita", 67000), "IT");
		tmap.put(new Employee(101, "ramesh", 25000), "HR");
		System.out.println(tmap);
		
		
	}

}
