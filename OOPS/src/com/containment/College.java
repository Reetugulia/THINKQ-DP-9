package com.containment;

public class College {
	public static void main(String[] args) {
		Course c1=new Course(101,"java",50000);
		Course c2=new Course(102,"python",60000);
		Course c3=new Course(103,"full stack",90000);
		
		Student s1=new Student(1,"reetu",c1);
		Student s2=new Student(2,"arpita",c2);
		Student s3=new Student(3,"nisha",c3);
		Student s4=new Student(4,"pranay",c1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//Hardcore method//////////////////////////////
		Course c=new Course();
		c.setCname("angular");
		c.setFees(54000);
		c.setCid(105);
		
		Student s=new Student();
		s.setSid(4);
		s.setSname("isha");
		s.setCourse(c);
		System.out.println(s);
	
		/////////////////////////////////////////////////////////
		Student st=new Student();
		st.setSid(5);
		st.setSname("sunil");
		st.setCourse(new Course());
		st.getCourse().setCid(106);
		st.getCourse().setCname("neeru");
		s1.getCourse().setFees(150000);
		
		System.out.println(st);
	}

}
