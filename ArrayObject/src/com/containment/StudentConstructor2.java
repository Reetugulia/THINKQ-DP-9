package com.containment;

public class StudentConstructor2 {
	static void countstudentcoursewise(Student s[],Course[]cour)
	{
		int count=0;
		for(Course c:cour)
		{
			for(Student st:s)
			{
				if(st.getCourse().equals(c))
				{
					count++;
				}
			}
			System.out.println(c+"------>"+count);
		}
	}
	static  void infostudentcoursewise(Student s[],Course[]cour)
	{
		
		for(Course c:cour)
		{
			System.out.println(c);
			for(Student st:s)
			{
				if(st.getCourse().equals(c))
				{
					System.out.println(st.getSid()+" "+st.getSname());
				}
			}
			System.out.println("---------------------------------------------");
		}
	}
	public static void main(String[] args) {
		Course c[]=new Course[3];
		c[1]=new Course(1,"java",65000); 
		c[2]=new Course(2,".ne1",68000); 
		c[0]=new Course(3,".python",58000); 
		
		Student st[]=new Student[6];
		st[0]=new Student(101,"reetu",c[1]);
		st[1]=new Student(102,"arpita",c[2]);
		st[2]=new Student(103,"pranay",c[0]);
		
		st[3]=new Student();
		st[3].setSid(104);
		st[3].setSname("pranay");
		st[3].setCourse(c[1]);
		
		st[4]=new Student(105,"priti",c[1]);
		st[5]=new Student(106,"pooja",c[2]);
		

		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		countstudentcoursewise(st,c);
		System.out.println("----------------------------");
		infostudentcoursewise(st,c);
	}

}
