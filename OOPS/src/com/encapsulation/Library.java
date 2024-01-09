package com.encapsulation;

public class Library {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setId(101);
		b1.setBname("Harry Potter");
		b1.setPrice(569);
		
		Book b2=new Book();
		b2.setId(104);
		b2.setBname("Atomic Habits");
		b2.setPrice(500);
		
		System.out.println("Book name:"+b1.getBname()+" "+b1.getPrice());
		System.out.println("Book name:"+b2.getBname()+" "+b2.getPrice());
		
		Book b3=new Book();
		System.out.println("Book name:"+b3.getBname()+" "+b3.getPrice());
		
		
	}

}
