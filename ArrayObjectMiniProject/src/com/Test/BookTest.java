package com.Test;

import java.util.Scanner;

import com.dao.BookDaoImpl;
import com.pojo.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int id;
		String bookname;
		float price;
		char ch;
		int books=0;
		Book book=null;
		BookDaoImpl bdao=new BookDaoImpl();
		do
		{
			System.out.println("Welcome to book store");
			System.out.println("==========================");
			System.out.println("your choices are:");
			System.out.println("1.Add Book");
			System.out.println("2.update  Book");
			System.out.println("3.Search Book");
			System.out.println("4.Delete Book");
			System.out.println("5.Show Book");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch (choice)
			{
			case 1:System.out.println("----Add Book-----");
			       System.out.println("How many books you want to add");
			       books=sc.nextInt();
			       for(int i=0;i<books;i++)
			       {
			    	   System.out.println("enter book id");
			    	   id=sc.nextInt();
			    	   System.out.println("enter book name");
			    	   bookname=sc.next();
			    	   System.out.println("enter book price");
			    	   price=sc.nextFloat();
			    	   book=new Book(bookname,id,price);
			    	   bdao.addBook(book);
			       }
			       break;
			case 2:System.out.println("---Update Book-----");  
			       System.out.println("enter book id:");
		         	id = sc.nextInt();
		        	System.out.println("enter book name:");
		        	bookname = sc.next();
		        	System.out.println("enter book price:");
		        	price = sc.nextFloat();
		        	book = new Book( bookname,id, price);
		         	bdao.updateBook(book);
		        	break;

			case 3:System.out.println("enter your id"); 
			       id=sc.nextInt();
			       book=bdao.searchByid(id);
			       if(book!=null)
			    	   System.out.println(book);
			       else
			    	   System.out.println("please recheck your book id");
			       break;
			case 4:System.out.println("delete book");
			       System.out.println("enter you id");
			       id=sc.nextInt();
			      
			       bdao.deleteBook(id);
			       break;
			    	  
			case 5:  if(books!=0) {
				     bdao.showAllBooks();
			          }  
			         else
			         {
			        	 System.out.println("no book found");
			         }
			        break;
			 default:System.out.println("there is no such choice exist.");  
			       
			}
			System.out.println("Do you want to continue?");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
	}

}
