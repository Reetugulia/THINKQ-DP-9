package com.oopassignment;

public class StudentMarks {
	int sb1;
	int sb2;
	int sb3;
	int sb4;
	int sb5;
	
	void insert(int sb1,int sb2,int sb3,int sb4,int sb5) {
		this.sb1=sb1;
		this.sb2=sb2;
		this.sb3=sb3;
		this.sb4=sb4;
		this.sb5=sb5;
	}
	void percentage() {
		double per=((sb1+sb2+sb3+sb4+sb5)*100)/500;
		if(per>60)
			System.out.println("Ist class");
		else if(per<=60&&per>40) 
			System.out.println("2nd class");
		else
			System.out.println("failed");
		
	}
	
	public static void main(String[] args) {
		StudentMarks s1=new StudentMarks();
		s1.insert(67, 55, 44, 42, 98);
		s1.percentage();
	}

}
