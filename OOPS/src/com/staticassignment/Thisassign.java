package com.staticassignment;
class school{
	String sname;
	int sid;
	
	school()
	{
		System.out.println("defalt constructor");
		
	}
	school(String sname,int sid)
	{
		this();//constructor chaining
		this.sid=sid; //this in left side show instance variable
		this.sname=sname;
		System.out.println("perimeterised");
	}
	void detail() {
		sid=1;
		sname="ritu";
	}
	void displaydetails() {
		this.detail();//call one method in another
	}
	
}
public class Thisassign {
	public static void main(String[] args) {
		school s1=new school();
		s1.detail();
		s1.displaydetails();
		school s2=new school("sunil",2);
		s2.detail();
		s2.displaydetails();
	}

}
