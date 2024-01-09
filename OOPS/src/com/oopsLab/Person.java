package com.oopsLab;

public class Person {
	String name;
	int age=28;
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="reetu";
		//p1.age;
		System.out.println("name:"+p1.name+" "+"age"+p1.age);
		
		Person p2=new Person();
		p2.age=30;
		System.out.println("name:"+p2.name+" "+"age"+p2.age);
	}

}
