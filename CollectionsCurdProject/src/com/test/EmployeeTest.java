package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.Employeeimplen;
import com.poja.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int eid;
			String ename;
			double esalary;
			int choice;
			char ch;
			Employee emp;
			
			Employeeimplen edao=new Employeeimplen();
			List <Employee> elist=new ArrayList<Employee>();
			do
			{
				System.out.println("---Welcome in MNC----");
				System.out.println("-----------------------");
				System.out.println("1.add Employee");
				System.out.println("2.update Employee");
				System.out.println("3.delete Employee");
				System.out.println("4.show Employee");
				System.out.println("5.Search Employee ");
				System.out.println("-------------------------------------");
				System.out.println("enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("--add information of employee");
				        System.out.println("how many employees do u want to add ?");
				        int num=sc.nextInt();
				        for(int i=0;i<num;i++)
				        {
				        	System.out.println("enter employee id");
				        	eid=sc.nextInt();
				        	System.out.println("enter name");
				        	ename=sc.next();
				        	System.out.println("enter salary");
				        	esalary=sc.nextDouble();
				        	emp=new Employee(eid,ename,esalary);
				        	edao.addEmploee(emp);
				        }
				        break;
			
				case 2: System.out.println("----update employee information---");   
			         	System.out.println("enter employee id");
	                	eid=sc.nextInt();
	                	System.out.println("enter name");
	                	ename=sc.next();
	                	System.out.println("enter salary");
	                 	esalary=sc.nextDouble();
	                 	emp=new Employee(eid,ename,esalary);
	                 	edao.updateEmploee(emp);
				case 3: System.out.println("Enter emp id:");
				        eid = sc.nextInt();
				        edao.deletebyid(eid);
				        break;
				case 4:  elist=edao.showEmployeelist()   ;
				        if(!elist.isEmpty())
				        {
				        	System.out.println("employee list");
				        	for(Employee e:elist)
				        	{
				        		System.out.println(e);
				        		}
				        }
				        else
				        	System.out.println("no list found");
				        break;
				case 5:System.out.println("------Seach details of employee----");    
				       System.out.println("enter your id:");
				       eid=sc.nextInt();
				       emp=edao.searchEmployeebyid(eid);
				       if(emp!=null)
				    	   System.out.println(emp);
				       else
				    	   System.out.println("no such id exist");
				       break;
				}
				System.out.println("Do you want to continue ?");
				ch=sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');
	}

}
