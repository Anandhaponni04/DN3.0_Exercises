package com.library.repository;

public class BookRepository {
	public void add(String title,String author) {
		System.out.println("Book named "+title+" written by "+author+" is saved successfully");
	}
	public void delete(String title) {
		System.out.println("Book titled "+title+" is deleted successfully");
	}
	public void update(String title) {
		System.out.println("Book "+title+" is updated successfully");
	}
}
