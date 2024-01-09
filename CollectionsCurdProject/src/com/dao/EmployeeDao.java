package com.dao;

import java.util.List;

import com.poja.Employee;

public interface EmployeeDao {

	void addEmploee(Employee emp);
	void updateEmploee(Employee emp);
	void deletebyid(int id);
	List<Employee> showEmployeelist();
	Employee searchEmployeebyid(int id);
}
