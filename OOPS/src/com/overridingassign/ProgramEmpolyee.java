package com.overridingassign;
class Programmer {
    
    void workingHours() {
        System.out.println("Programmer works 40 hours a week");
    }
}


class Employee extends Programmer {
    
    @Override
    void workingHours() {
        System.out.println("Employee works 35 hours a week");
    }
}
public class ProgramEmpolyee {
	  public static void main(String[] args) {
	       
	        Programmer programmer = new Programmer();
	        
	      
	        System.out.println("Programmer Information:");
	        programmer.workingHours();
	        System.out.println();

	       
	        Employee employee = new Employee();

	     
	        System.out.println("Employee Information:");
	        employee.workingHours();
	    }

}
