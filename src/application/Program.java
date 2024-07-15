package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Book;
import entities.Library;
import entities.enums.BookGenre;

public class Program {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Library library = new Library();
		
		System.out.println("Book information: ");
		System.out.print("Book name: ");
		String name = scan.next();
		scan.next();
		
		System.out.print("Book author: ");
		String author = scan.next();
		
		System.out.print("Book genre: ");
		BookGenre genre= BookGenre.valueOf(scan.next());
		
		Book book = new Book(name, author, genre);
		library.addBook(book);
		
		System.out.println("Book Data's: ");
		System.out.print(book);
		
//		System.out.println("Library Books: ");
//		for (Book b: library.getBooks()) {
//			System.out.println(b);
//		}
		
		scan.close();
	}
}
