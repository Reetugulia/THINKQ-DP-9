package com.constructor;
//POJO class -Plain old java object
class Employee {
	 
	private int eid;
	private String ename;
	private double esalary;
	
	 public Employee() {
			
		}
	 
	 public Employee(int eid,String ename,double esalary)
	 {
		 this.eid=eid;
		 this.ename=ename;
		 this.esalary=esalary;
	 }
	
	public void setEid( int eid)
	{
		this.eid=eid;
	}
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
	
	public void setEsalary( double esalary)
	{
		this.esalary=esalary;
	}
	public double getEsalary()
	{
		return esalary;
	}
	
	public String toString()
	{
		return ename+" "+eid+" "+esalary;
	}
	
	
}
 public class Company
 {
	 public static void main(String[] args) {
		Employee e1=new  Employee(101,"reetu",50000);
		 Employee e2=new  Employee(102,"rishi",60000);
		
		System.out.println(e1);
		System.out.println(e2);
		
		 Employee e3=new  Employee();
		e3.setEid(103);
		e3.setEname("sunil");
		e3.setEsalary(200000);
		
		System.out.println(e3);
		
		
		
	}
	 
 }
