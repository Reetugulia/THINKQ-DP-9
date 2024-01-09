package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> s1=new ArrayList<>();
		s1.add(new Student("reetu",104,78));
		s1.add(new Student("nisha",101,78));
		s1.add(new Student("pooja",102,70));
		s1.add(new Student("neha",103,67));
		for(Student st:s1)
		{
			System.out.println(st);
		}
		//Collections.sort(s1);
//		Collections.sort(s1, new MarksComparator2());
		Collections.sort(s1,new IdComparator());
		System.out.println("---------------------------------------");
		for(Student st:s1)
		{
			System.out.println(st);
		}
	}
	

}
