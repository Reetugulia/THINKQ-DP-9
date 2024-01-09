package com.encapsulation;

import java.util.Scanner;

public class Library2 {
	static Scanner sc=new Scanner(System.in);
	public static void insertBook(Book b)
	{
		System.out.println("enter id");
		b.setId(sc.nextInt());
		
		System.out.println("enter book name");
		b.setBname(sc.next());
		
		System.out.println("enter book price");
		b.setPrice(sc.nextDouble());
		
	}
	public static void main(String[] args) {
		Book b1=new Book();
		insertBook (b1);
		
		Book b2=new Book();
		insertBook (b2);
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
	}

}
