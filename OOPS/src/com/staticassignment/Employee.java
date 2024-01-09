package com.staticassignment;
 class employeedetail{
	int employee_id; 
	 String name; 
	 double salary;
	 
	    
	   employeedetail(){
		   
	   }
	   employeedetail(int employee_id,String name,double salary)
	   {
		  this.employee_id=employee_id ;
		  this.name=name;
		  this.salary=salary;
	   }
	   void display()
	   {
		   System.out.println("name:"+name+" "+"employee_id:"+employee_id+" "+"salary:"+salary);
	   }
	   static int totalemployee(int totalemployees)
	   {
		  
		   return totalemployees;
	   }
 }
public class Employee {
	public static void main(String[] args) {
		employeedetail e1=new employeedetail();
		System.out.println(employeedetail.totalemployee(15));
	    e1.display();
	    employeedetail e2=new employeedetail(1,"reetu",50000);
	   e2.display();
	}

}
