package entities;

import entities.enums.BookGenre;

public class Book {
	private String title;
	private String author;
	private BookGenre genre;
	
	public Book() {
	}

	public Book(String title, String author, BookGenre genre) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookGenre getGenre() {
		return genre;
	}

	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + "\n" +
				"Author: " + author + "\n"+
				"Genre: " + genre;
	}
	
}
