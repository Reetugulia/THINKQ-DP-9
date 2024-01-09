package com.containmentassignment;
class Department{
	private String name;
	private int id;
	
	Department()
	{
		
	}
	Department(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public String toString() 
	{
		return "{"+"department name:"+name+"  department id:"+id+" }";
	}
	
}

public class Student {
	private String sname;
	private int sid;
	Department department ;

	Student()
	{
		
	}
	Student(String sname,int sid)
	{
		this.sname=sname;
		this.sid=sid;
	}
	public void setSame(String sname)
	{
		this.sname=sname;
	}
	public String getSame()
	{
		return sname;
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public int getSid()
	{
		return sid;
	}
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	public String toString() 
	{
		return "{"+"student name:"+sname+"  student id:"+sid+" department name:"+department;
	}
	public static void main(String[] args) {
		Student s1=new Student("reetu",101) ;
		Department d1=new Department("admin",1) ;
		Department d2=new Department("counselling",2) ;
		
		s1.setDepartment(d2);
		
		Student s2=new Student("sunil",102) ;
		
		s2.setDepartment(d1);
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}
}
