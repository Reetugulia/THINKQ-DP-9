package com.interfacedemo;
interface Student1
{
	void show();
  default	void display() {
		System.out.println("i m student");
	}
	
	
}
interface Teacher
{
	void show();
	default void display() {
		System.out.println("i m teacher");
	};
}
public class DiamondProblem implements Student1,Teacher{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Heritage school");
	}

	@Override
	public void display() {
		Student1.super.display();
		Teacher.super.display();
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		DiamondProblem d1=new DiamondProblem();
		d1.show();
		d1.display();
		
		
	}

}
