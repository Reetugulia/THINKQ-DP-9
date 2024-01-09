package com.interfaceassignment;

import com.oopsLab.MainClas;

abstract class Phonebook
{
	 
	public Phonebook() {
		super();
		// TODO Auto-generated constructor stub
	}



	abstract void contactdetail() ;
	
}
class Person1 extends Phonebook
{
	 final String name;
	 final long number=987777777;

	@Override
	void contactdetail() {
		// TODO Auto-generated method stub
		System.out.println("person name:"+name+" "+"number:"+number);
	}

	public Person1(String name) {
		super();
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	



}

public class PhonebookDetail {
	public static void main(String[] args) {
		Phonebook P;
		P=new Person1("reetu");
		P.contactdetail();
	}

}
