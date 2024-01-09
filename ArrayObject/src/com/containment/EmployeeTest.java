package com.containment;

public class EmployeeTest {
	static void countemployeedepart(Employee e2[],Department dp[])
	{
		int count=0;
		for(Department d:dp)
		{
			count=0;
			for(Employee e:e2)	
			{
				if(e!=null) {
				
			if(e.getDepartment().equals(d)) 
			{
				count++;
			}
				}
				
			}
			System.out.println(dp+"---"+count);
			
		}
	
	}
	static  void infoemployee(Employee e2[],Department dp[])
	{
		
		for(Department d:dp)
		{
			System.out.println(d.getDpname());
			for(Employee e:e2)
			{
				if(e!=null && d!=null) {
				if(e.getDepartment().equals(d))
				{
					System.out.println(e.getId()+" "+e.getName());
				}
				}
			}
			System.out.println("---------------------------------------------");
		}
	}
	public static void main(String[] args) {
		Department d[]=new Department[3];
		d[0]=new Department(1,"HR");
		d[1]=new Department(2,"IT");
		d[2]=new Department(3,"Admin");
		
		Employee e[]=new Employee[8];
    /*	e[0].setId(101);
		e[0].setName("reetu");
		e[0].setDepartment(d[1]);
		e[0].setSalary(90000);*/
		
		
		e[1]=new Employee(102,"sunil",150000,d[1]);
		e[2]=new Employee(103,"rohan",50000,d[2]);
		e[3]=new Employee(104,"ruchika",60000,d[0]);
		e[4]=new Employee(105,"arpita",70000,d[0]);
		e[5]=new Employee(106,"pranay",50000,d[2]);
		e[6]=new Employee(107,"nisha",65000,d[1]);
		e[7]=new Employee(108,"raghav",55000,d[1]);
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		//	System.out.println(e[0].getId()+" "+e[0].getSalary()+e[0].getName()+e[0].getId());
		}
		countemployeedepart(e,d);
		System.out.println("========================");
		infoemployee(e,d);
		
		
				
				
	}	

}
