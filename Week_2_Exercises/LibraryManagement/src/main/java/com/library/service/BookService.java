package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	 private BookRepository repo;
	 public BookService() {
	 }
	
	 public void setRepo(BookRepository repo) {
	     this.repo = repo;
	 }
	 
	 public void saveBook(String title,String author) {
		  repo.add(title, author);
	 }
	 
	 public void updateBook(String title) {
		  repo.update(title);
	 }
	 
	 public void deleteBook(String title) {
		  repo.delete(title);
	 }
}
