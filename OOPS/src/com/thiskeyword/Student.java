package com.thiskeyword;

public class Student {
	private int id;
	private String name;
	
	
	
	public void setId(int id)
	{
		//this.id=id;
		id=id;
		
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString() {
		return "{"+"name:"+name+" "+"student id:"+id+"}";
	}
	
	public static void main(String[] args) {
		Student s1=new Student ();
		Student s2=new Student ();
		
		s1.setId(11);
		s2.setId(22);
		
		System.out.println("student is:"+s1.getId());
		
	}

}
