package com.oopassignment;

public class StudentQ9 {
	int sroll;
	String sname;
	public static void main(String[] args) {
		StudentQ9 s1=new StudentQ9();
		s1.sroll=1;
		s1.sname="reetu";
		System.out.println("student name:"+s1.sroll+" "+"student roll no:"+s1.sname);
		
		StudentQ9 s2=s1;
		System.out.println("student name:"+s2.sroll+" "+"student roll no:"+s2.sname);
		
		//StudentQ9 s2=new StudentQ9();
		//System.out.println("student name:"+s2.sroll+" "+"student roll no:"+s2.sname);
	}

}
