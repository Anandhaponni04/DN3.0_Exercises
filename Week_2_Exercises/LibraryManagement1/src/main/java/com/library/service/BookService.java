package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	BookRepository bookrepository;
	
	public BookService(BookRepository bookrepository) {
		this.bookrepository = bookrepository;
		System.out.println("This BookRepository is initialized by constructor injection");
	}
	public BookRepository getBookrepository() {
		return bookrepository;
	}

	public void setBookrepository(BookRepository bookrepository) {
		this.bookrepository = bookrepository;
		System.out.println("This BookRepository is initialized by setter injection");
	}
	public void show() {
		bookrepository.demo();
	}
}
