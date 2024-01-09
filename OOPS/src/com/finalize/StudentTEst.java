package com.finalize;

public class StudentTEst {
	public static void main(String[] args) {
		Student s=new Student("reetu",1);
		s=null;
		System.gc();
	}
	

}
