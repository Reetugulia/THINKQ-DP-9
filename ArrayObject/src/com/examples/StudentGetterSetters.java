package com.examples;

import java.util.Scanner;

public class StudentGetterSetters {
	static Scanner sc=new Scanner(System.in);
	static void insertStudents(Student s)
	{
		System.out.println("enter student name");
		s.setName(sc.next());
		
		System.out.println("enter roll no");
		s.setRollno(sc.nextInt());
		
		System.out.println("enter marks");
		s.setMarks(sc.nextInt());
		
	}
	public static void main(String[] args) {
	Student st[]= new Student[3];
		
		for(int i=0;i<st.length;i++)
		{
			st[i]= new Student();
			insertStudents(st[i]);
			
		}
		
		System.out.println("---------------------------");
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
		sc.close();
		
	}

}
