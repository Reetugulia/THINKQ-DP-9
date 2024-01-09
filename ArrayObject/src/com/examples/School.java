package com.examples;

public class School {
	public static void topper(Student  s1[]) 
	{
		double maxMarks=Double.MIN_VALUE;
		Student top=new Student();
		for(Student s:s1) 
		{
			if(s.getMarks()>maxMarks)
			{
				top=s;
				maxMarks=s.getMarks();
			}
		}
		System.out.println("Topper of students:");
		System.out.println(top);
		
	}
	public static void sortMarks(Student s1[]) 
	{
		Student temp=new Student();
		for(int i=0;i<s1.length;i++) 
		{
			for(int j=i+1;j<s1.length;j++) 
			{
				if(s1[i].getMarks()>s1[j].getMarks())
				{
					temp=s1[i];
			    	s1[i]=s1[j];
			     	s1[j]=temp;
				}

			
			}
		}
	
	}
	public static void main(String[] args) {
	//	Student s1=new Student();
		Student st[]=new Student[5];//no std object is created
		System.out.println(st[0]);
		System.out.println("-----------------------------");
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
		}
		st[0]=new Student(1,"anil",78);
		st[1]=new Student(2,"reetu",80);
		st[2]=new Student(3,"sunil",78);
		st[3]=new Student(4,"rohan",76);
		st[4]=new Student(5,"ruchika",81);
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println("-----------------------------------------");
	/*	for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}*/

		topper( st) ;
		sortMarks(st) ;
		   for(Student s: st)
		   {
			   System.out.println(s);
		   }
		
	}

}
