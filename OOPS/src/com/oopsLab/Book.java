package com.oopsLab;

public class Book {
	 private int bookid;
	 private String bookname;
	 private int bookprice;
	 private String bookauthor;
	 
	/* public void setdetails(int id,String name,int price,String author )
		{
		  bookid=id;
		  bookname=name;
		  bookprice=price;
		  bookauthor=author;
		 
		 
		}*/
	 public void setBookid(int bookid )
	 {
		 this.bookid=bookid;
	 }
	 public int getBookid()
	 {
		 return bookid;
	 }
	 
	 public void setBookName(String bookname )
	 {
		 this.bookname=bookname;
	 }
	 public String getBookName()
	 {
		 return bookname;
	 }
	 
	 public void setBookPrice(int bookprice )
	 {
		 this.bookprice=bookprice;
	 }
	 public int getBookprice()
	 {
		 return bookprice;
	 }
	 
	 public void setBookauthor(String bookauthor)
	 {
		 this.bookauthor=bookauthor;
	 }
	 public String getBookAuthor()
	 {
		 return bookauthor;
	 }
	 
	 public void setdetails(int bookid,String bookname,int bookprice,String bookauthor )
		{
		  this.bookid=bookid;
		  this.bookname=bookname;
		  this.bookprice=bookprice;
		  this.bookauthor=bookauthor;
		 
		 
		}
	
	public void show()
	{
		System.out.println("book name"+bookname);
		System.out.println("book id:"+bookid);
		System.out.println("book price:"+ bookprice);
		System.out.println("book author:"+bookauthor);
	}
	
	/*public void setdetails()
	{
		bookid=101;
		bookname="Ask and it is given";
		bookprice=500;
		bookauthor="Ester Hicks";
	}*/

}
