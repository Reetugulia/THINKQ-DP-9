package com.demostatic;

public class Company {
	public static void main(String[] args) {
		//System.out.println(Employee.companyName);
				System.out.println(Employee.getCompanyname());

				Employee e1= new Employee(101, "Reetu",23000);
				Employee e= new Employee();
				//System.out.println(Employee.companyname);
				
				System.out.println(e);
				System.out.println(e1);
				
				//e.setCompanyname("Infosys");  // Warning,  it is not an error
				
				Employee.setCompanyname("Infosys");
				
				System.out.println(e);
				System.out.println(e1);
	}

}
