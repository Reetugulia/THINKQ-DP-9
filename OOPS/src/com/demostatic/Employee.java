package com.demostatic;

public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	//static String companyname;
	//static String companyname="HCL";
	private static String companyname;
	
	static int empcount;
	
	static //block
	{
		companyname="HCL";
	}
	
	
	//instance block
	{
		System.out.println("In instance block");
		//companyname="HCL";
		empcount++;
	}
	
	 public Employee(){
		 System.out.println("In constructor");
		 //companyname="HCL";
		
	}
	
	 public Employee( int eid,String ename,double esalary){
		 //this();
		 this.eid=eid;
		 this.ename=ename;
		 this.esalary=esalary;
	}
	
	public void setEid(int eid)
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
	public void setEsalary(double esalary)
	{
		this.esalary=esalary;
	}
	public double getEsalary()
	{
		return esalary;
	}
	public static void setCompanyname(String companyname)
	{
		Employee.companyname= companyname;
	}
	
	public static String getCompanyname()
	{
		return companyname;
	}


	
	public String toString() {
		return "Employee [id=" + eid + ", ename=" + ename + ", salary=" + esalary + ", company=" + companyname+"]";
	}
	

}
