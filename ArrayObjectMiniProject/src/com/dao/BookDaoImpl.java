package com.dao;

import com.pojo.Book;

public class BookDaoImpl implements BookDao{

	Book bookarr[];
	int i;
	int index;
	Book book=null;
	
	public BookDaoImpl(){
		bookarr=new Book[8];
		index=0;
		
	}
	@Override
	public void addBook(Book book) {
		bookarr[index]=book;
		index++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book1) {
		book=searchByid(book1.getId());
		if(book!=null)
		{
			System.out.println("Book is present");
			for(int i=0;i<index;i++)
			{
				if(book1.getId()==bookarr[i].getId()) 
				{
					bookarr[i]=book1;
					System.out.println("book updated");
					break;
				}
			}
		}
		else
			System.out.println("Book is not present");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book searchByid(int id) {
		Book b=null;
		for(int i=0;i<index;i++) {
			if(bookarr[i].getId()==id) {
				b=bookarr[i];
				
				break;
			}
		}
		return b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		book=searchByid(id);
		if(book!=null)
		{
			System.out.println("Book is present");
			for(int i=0;i<index;i++)
			{
				if(id==bookarr[i].getId()) 
				{
					bookarr[i]=null;
					System.out.println("book is removed");
					break;
				}
			}
		}
		else
			System.out.println("Book is not present");
	}

	@Override
	public void showAllBooks() {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++) {
			System.out.println(bookarr[i]);
		}
	}

}
