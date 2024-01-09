package com.dao;

import com.pojo.Book;

public interface BookDao {
	void addBook(Book book);
	void updateBook(Book book);
	Book searchByid(int id);
	void deleteBook(int id);
	void showAllBooks();

}
