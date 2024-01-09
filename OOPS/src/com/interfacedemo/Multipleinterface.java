package com.interfacedemo;

interface Showable
{
	void display();
}
interface Printable
{
	void display();
}
class Demo implements Showable,Printable
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
public class Multipleinterface {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
	}

}
