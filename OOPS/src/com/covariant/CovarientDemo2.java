package com.covariant;
class MyPerson
{
	String name;
	int id;
	MyPerson()
	{
		
	}
	MyPerson(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	MyPerson showDetail() 
	{
		name=name+"Think quo";
		return this;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
		
}
class MyEmployee extends Person
{
	float salary;
	
	MyEmployee()
	{
		
	}
	MyEmployee(String name,int id,float salary)
	{
		super(name,id);
		this.salary=salary;
	}
	MyEmployee showDetail() 
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
public class CovarientDemo2 {
	public static void main(String[] args) {
		MyPerson p;
		MyEmployee e;
		MyPerson p1=new MyPerson("reetu",1);
		p=p1.showDetail();
		System.out.println(p);
		System.out.println("----------------------------------------------------------------");
		MyPerson p2=new MyPerson("sunil",2);
		
		
		System.out.println(p);
		p=p2.showDetail();
		MyEmployee e1=new MyEmployee("ketan",3,50000);
		//p=e1.showDetail();
	//	System.out.println(p);//overridden string
		
		e=e1.showDetail();
		System.out.println(e);
	}
	
	

}
