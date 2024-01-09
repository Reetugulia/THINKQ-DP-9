package com.setdemo;

import java.util.TreeSet;

public class BookTreeSet {
	public static void main(String[] args) {
		TreeSet<Book> bk=new TreeSet<Book>(new PriceComparator());
		bk.add(new Book(1, "atomic habit", 300));
		bk.add(new Book(3, "good vibes", 250));
		bk.add(new Book(4, "Secret", 400));
		bk.add(new Book(2, "power of positive", 700));
		/////////
		for(Book b:bk)
		{
			System.out.println(b);
		}
		
	}

}
