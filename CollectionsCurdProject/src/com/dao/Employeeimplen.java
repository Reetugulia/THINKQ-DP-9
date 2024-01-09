package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.poja.Employee;

public class Employeeimplen implements EmployeeDao{

	Employee eobj;
	List<Employee>elist=null;
	public Employeeimplen() {
		elist=new ArrayList<Employee>();
	}
	@Override
	public void addEmploee(Employee emp) {
		// TODO Auto-generated method stub
		elist.add(emp);
	}

	@Override
	public void updateEmploee(Employee emp) {
		eobj=searchEmployeebyid(emp.getEid());
		if(eobj!=null)
		{
			System.out.println("book is present");
			for(int i=0;i<elist.size();i++)
			{
				if(emp.getEid()==elist.get(i).getEid())
				{
					elist.set(i, emp);
					System.out.println("employee updated");
				}
			}
		}
		else
			System.out.println("employee is not present");
		
	}

	@Override
	public void deletebyid(int id) {
	
		eobj=searchEmployeebyid(id);
		if(eobj!=null)
		{
			for(int i=0;i<elist.size();i++)
			{
				if(id==elist.get(i).getEid())
				{
					elist.remove(i);
					System.out.println("employee deleted");
				}
			}
		}
		else
			System.out.println("no record found");
	}

	@Override
	public List<Employee> showEmployeelist() {
		
		return elist;
	}

	@Override
	public Employee searchEmployeebyid(int id) {
		// TODO Auto-generated method stub
		eobj=null;
		for(int i=0;i<elist.size();i++)
		{
			if(id==elist.get(i).getEid())
			{
				System.out.println("id"+id);
				eobj=elist.get(i);
				break;
			}
		}return eobj;
	}

}
