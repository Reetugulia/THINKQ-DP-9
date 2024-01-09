package com.interfacedemo;
interface Payment
{
	void pay(float amount);
}
class Student implements Payment
{
	String sname;
	int id;
	double qfees;
	
	Student()
	{
		
	}

	public Student(String sname, int id, double qfees) {
		super();
		this.sname = sname;
		this.id = id;
		this.qfees = qfees;
	}

	@Override
	public void pay(float amount) {
		System.out.println("student name:"+sname+" "+"id"+id);
		System.out.println("your total fees:"+qfees);
		System.out.println("fees paid:"+amount);
		if((qfees-amount)!=0)
			System.out.println("remaining fees:"+(qfees-amount));

	}
	
	
}
class Celebrity implements Payment
{
	String addharcard;
	String cname;
	double income;
	public Celebrity(String addharcard, String cname) {
		super();
		this.addharcard = addharcard;
		this.cname = cname;
		
	}
	@Override
	public void pay(float amount) {
		double taxamount;
		System.out.println("Welcome to tax payment:"+cname);
		System.out.println("total earning:"+amount);
		if(amount>1000000)
			taxamount=.3*amount;
		else if(amount>700000)
			taxamount=.2*amount;
		else if(amount>500000)
			taxamount=.1*amount;
		else
			taxamount=0;
		
		System.out.println("tax to be paid:"+taxamount);
		income=amount-taxamount;
		System.out.println("income:"+income);
	
		
	}
	
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Payment p;
		p=new Student("reetu",1,50000);
		p.pay(34000);
		System.out.println("----------------------------------------------");
		p=new Celebrity("adh1342","vijay");
		p.pay(6000000);
		
	}

}
