package com.containment;

public class Employee {
	private String ename;
	private int eid;
	private Department department;
	
	Employee()
	{
		
	}
	Employee(String ename,int id,Department department)
	{
		this.ename=ename;
		this.eid=eid;
		this.department=department;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public int getEid()
	{
		return eid;
	}
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	public Department getDepartment()
	{
		return department;
	}
	
	
	public String toString()
	{
		return "{"+"employee name:"+ename+" "+" employee id:"+eid+"  department:"+department+"}";
	}

}
