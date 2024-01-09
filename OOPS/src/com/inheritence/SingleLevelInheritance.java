package com.inheritence;
class Employee{
	private int id;
	private String name;
	protected float salary;
	
	public Employee ()
	{
		System.out.println("in employee default constructor");
	}
	public  Employee (int id,String name,float salary) 
	{
		System.out.println("in employee parameter constructor");
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "employee name:"+name+" employee id:"+id+" salary :"+salary;
	}
}
	
class Manager extends Employee
{
	 private float experience;
	 private String role;
	 
	 Manager()
	 {
		 
	 }
	 Manager(float experience,String role,int id,String name,float salary)
	 {
		 super(id,name,salary);
		 this.experience=experience;
		 this.role=role;
	 }
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return super.toString()+"Manager [experience=" + experience + ", role=" + role + "]";
	}
	 
	
	}	




	


public class SingleLevelInheritance {
	public static void main(String[] args) {
		Manager m=new Manager();
	}

}
