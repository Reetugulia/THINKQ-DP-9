package com.dao;


import com.pojo.Student;

public class StudentImplements implements StudentDao{

	Student stuarr[];
	int i;
	int index;
	Student student=null;
    public StudentImplements(){
    	stuarr=new Student[8];
		index=0;
	}
	@Override
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		stuarr[index]=student;
		index++;
	}

	@Override
	public void updateStudent(Student student) {
		student=searchByid(student.getId());
		if(student!=null)
		{
			System.out.println("student is present");
			for(int i=0;i<index;i++)
			{
				if(student.getId()==stuarr[i].getId()) 
				{
					stuarr[i]=student;
					System.out.println("student detail updated");
					break;
				}
			}
		}
		else
			System.out.println("student is not present");
		
	}

	@Override
	public void deletebyid(int id) {
		student=searchByid(id);
		if(student!=null)
		{
			System.out.println("student is present");
			for(int i=0;i<index;i++)
			{
				if(id==stuarr[i].getId()) 
				{
					stuarr[i]=null;
					System.out.println("student is removed");
					break;
				}
			}
		}
		else
			System.out.println("student is not present");
	}
		
	

	@Override
	public Student searchByid(int id) {
		Student s=null;
		for(int i=0;i<index;i++) {
			if(stuarr[i].getId()==id) {
				s=stuarr[i];
				
				break;
			}
		}
		return s;
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public void showAllStudents() {
		for(int i=0;i<index;i++) {
			System.out.println(stuarr[i]);
		}
	}
		
	}


