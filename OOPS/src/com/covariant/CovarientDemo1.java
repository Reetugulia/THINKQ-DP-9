package com.covariant;
class Person
{
	String name;
	int id;
	Person()
	{
		
	}
	Person(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	Person showDetail() 
	{
		name=name+"Think quo";
		return this;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
		
}
class Employee extends Person
{
	float salary;
	
	Employee()
	{
		
	}
	Employee(String name,int id,float salary)
	{
		super(name,id);
		this.salary=salary;
	}
	Person showDetail() 
	{
		name=name+"Think quotient";
		salary=salary+1000;
		return this;
	}
	@Override
	public String toString() {
		return super.toString()+"[salary=" + salary + "]";
	}
	
	
}
public class CovarientDemo1 {
	public static void main(String[] args) {
		Person p;
		Employee e;
		Person p1=new Person("reetu",1);
		p=p1.showDetail();
		System.out.println(p);
		System.out.println("----------------------------------------------------------------");
		Person p2=new Person("sunil",2);
		
		
		System.out.println(p);
		p=p2.showDetail();
		Employee e1=new Employee("ketan",3,50000);
		p=e1.showDetail();
		System.out.println(p);//overridden string
		
		e=(Employee) e1.showDetail();
		System.out.println(e);
	}
	
	

}
