package com.shristi.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Java in Action", 1,"Kathy", 450.90, "Tech"),
				new Book("Angular",2,"John",980.90,"Tech"),
				new Book("Atomic Habits",3,"James",580.90,"selfhelp"),
				new Book("Leadership",4,"Robin",380.90,"selfhelp"),
				new Book("The 5am club",5,"Robin",780.90,"selfhelp"),
				new Book("3000 Stitches",6,"Sudha",580.90,"Fiction"),
				new Book("Corporate Bahu",2,"Sudha",1280.90,"Fiction")
			);
		Collections.sort(books);
		for(Book book:books) {
			System.out.println(book);
		}
	}
}
