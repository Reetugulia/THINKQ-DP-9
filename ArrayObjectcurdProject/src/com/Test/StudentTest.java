package com.Test;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentImplements;

import com.pojo.Student;


public class StudentTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		char ch;
		int students=0;
		int id;
		Student student=null;
		String name;
		int choice;
		StudentImplements studentDao=new StudentImplements();
		do
		{
			System.out.println("enter your choices");
			System.out.println("1.add Student");
			System.out.println("2.update Student");
			System.out.println("3. delete by id");
			System.out.println("4.Search by id");
			System.out.println("4.Show Students");
			System.out.println("do u want to continue ?");
			System.out.println("enter you choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("-----add students-------------");
				   System.out.println("How many students you want to add");
		           students=sc.nextInt();
		          for(int i=0;i<students;i++)
		          {
		    	   System.out.println("enter student id");
		    	   id=sc.nextInt();
		    	   System.out.println("enter student  name");
		    	   name=sc.next();
		    	  
		    	   student=new Student(id,name);
		    	   studentDao.addStudent(student);
		          }
		       break;
			case 2:System.out.println("---Update Book-----");  
		           System.out.println("enter Student id:");
	               id = sc.nextInt();
	        	   System.out.println("enter student name:");
	        	   name = sc.next();
	              
	        	   student=new Student(id,name);
	               studentDao.updateStudent(student);
	            	break;
			case 3:System.out.println("delete Student");
		           System.out.println("enter you id");
		           id=sc.nextInt();
		      
		           studentDao.deletebyid(id);
		           break;
			case 4:System.out.println("enter your id"); 
		          id=sc.nextInt();
		          student=studentDao.searchByid(id);
		          if(student!=null)
		    	   System.out.println(student);
		          else
		    	   System.out.println("please recheck your  id");
		          break;
			case 5: if(students!=0) {
			       studentDao.showAllStudents();
		            }  
		           else
		          {
		        	 System.out.println("no book found");
		          }
		        break;
		 default:System.out.println("there is no such choice exist.");   
			}
			
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
