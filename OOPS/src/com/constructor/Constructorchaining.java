package com.constructor;

class Student{
	int id;
	String name;
	float marks;
	
	Student(){
		id=100;
		name="unknown";
		marks=33;
	}
	Student(int id,String name)
	{
		this();
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+marks+" "+name;
	}
}


public class Constructorchaining {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1);
		
		Student s2=new Student(1,"reetu");
		System.out.println(s2);
	}

}
