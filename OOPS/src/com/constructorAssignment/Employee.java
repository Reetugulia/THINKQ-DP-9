package com.constructorAssignment;

public class Employee {
	private int emp_id;
	private String ename;
	private double salary;
	
	Employee()
	{
		
	}
	Employee(int emp_id,String ename,double salary)
	{
		this.emp_id=emp_id;
		this.ename=ename;
		this.salary=salary;
	}
	
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "employee name:"+ename+" employee id:"+emp_id+" employee salary"+salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmp_id(1);
		e1.setEname("reetu");
		e1.setSalary(50000);
		
		System.out.println("employee name:"+e1.getEname()+" "+"employee id:"+e1.getEmp_id()+" "+"employee salary:"+e1.getSalary());
		
		Employee e2=new Employee(2,"naveen",75000);
		System.out.println(e2);
	}
	

}
