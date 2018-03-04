package com.in28steps.springboot.basics.springbootin10steps;

public class Book {
	
	long id;
	String title;
	String author;
	
	public Book(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + title + ", author=" + author + "]";
	}
	
	
}
