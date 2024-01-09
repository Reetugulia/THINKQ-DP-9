package com.dao;

import com.pojo.Student;

public interface StudentDao {
	
	void addStudent(Student student);
	void updateStudent(Student student);
	void deletebyid(int id) ;
    Student searchByid(int id);
	void showAllStudents();
	
}
