package com.questionpractise;

import java.util.Collections;
import java.util.LinkedList;

public class Company {
	public static void main(String[] args) {
		LinkedList<Employee> detail=new LinkedList<>();
		detail.add(new Employee("reetu",101,50000));
		detail.add(new Employee("arpita",104,45000));
		detail.add(new Employee("pranay",103,40000));
		detail.add(new Employee("pranali",102,50000));
		Collections.sort(detail,new SalaryComparator() );
		for(Employee e:detail)
		{
			System.out.println(e);
		}
		
	}

}
