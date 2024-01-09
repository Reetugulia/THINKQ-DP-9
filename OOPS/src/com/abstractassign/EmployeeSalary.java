package com.abstractassign;
abstract class Employe
{
	String ename;
	int id;
	int hoursofwork;
	
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String ename, int id, int hoursofwork) {
		super();
		this.ename = ename;
		this.id = id;
		this.hoursofwork = hoursofwork;
	}
	void showdetails() 
	{
		System.out.println("name:"+ename+" "+"id:"+id+ " "+"hoursofwork:"+hoursofwork);
	}
	abstract void salary();
}
class ParttimeEmployee extends Employe
{

	
	public ParttimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParttimeEmployee(String ename, int id, int hoursofwork) {
		super(ename, id, hoursofwork);
		// TODO Auto-generated constructor stub
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary:"+hoursofwork*200);
	}
	
}
class FulltimeEmployee extends Employe
{

	
	public FulltimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FulltimeEmployee(String ename, int id, int hoursofwork) {
		super(ename, id, hoursofwork);
		// TODO Auto-generated constructor stub
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary:"+500*hoursofwork);
	}
	
}

public class EmployeeSalary {
	public static void main(String[] args) {
		Employe e;
		e=new FulltimeEmployee("reetu",1,80);
		e.salary();
		e=new ParttimeEmployee("naveen",2,60);
		e.salary();
	}

}
