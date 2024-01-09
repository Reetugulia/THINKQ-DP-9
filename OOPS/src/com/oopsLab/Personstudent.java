package com.oopsLab;
class Person1
{  private String personname;
   private int personage;
   
   
   public Person1()
   {
	super();
	personname="reetu";
	personage=28;
			
	// TODO Auto-generated constructor stub
    }
    public Person1(String personname, int personage)
    {
	super();
	this.personname = personname;
	this.personage = personage;
}
    void show()
    {
    	System.out.println("personname:"+ personname+"  "+" personname:"+personname);
    }
	@Override
	public String toString() {
		return "Person [personname=" + personname + ", personage=" + personage + "]";
	}
  
	}
class Student extends Person1
{
	private int rollno;
	
	Student()
	{
		
	}
	public Student(int rollno,String personname, int personage) {
		super( personname, personage);//super use to invoke  parent constructor
		this.rollno = rollno;
	}
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	void superuse() 
	{
		super.show();//super use to invoke parent method
		
	}

	@Override
	public String toString() {
		return super.toString()+"Student [rollno=" + rollno + "]";//using parent methos
	}
	
	
	}

public class Personstudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.setRollno(5);
		System.out.println(s);
		Student s1=new Student();
		System.out.println(s1);
		Student s2=new Student();
		System.out.println(s2);
		
		
		
		
		
	}

}
