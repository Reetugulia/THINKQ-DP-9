package com.pojo;

public class Book {
	private String bookname;
	private int id;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookname, int id, float price) {
		super();
		this.bookname = bookname;
		this.id = id;
		this.price = price;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", id=" + id + ", price=" + price + "]";
	}
	

}
