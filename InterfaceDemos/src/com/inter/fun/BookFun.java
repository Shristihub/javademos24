package com.inter.fun;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BookFun {

	public static void main(String[] args) {
		
		Book book = new Book("Head First Java","Kathy",1);
		Consumer<Book> bcon = bookobj ->System.out.println(bookobj.getTitle());
		bcon.accept(book);
		
		Supplier<Book> sup = ()->new Book("Angular","James",2);
		System.out.println(sup.get());
		
		Function<Book, String> fun1 = nbook->nbook.getAuthor();
		System.out.println(fun1.apply(book));
		
		Function<Book, Integer> fun2 = nbook->nbook.getTitle().length();
		System.out.println(fun2.apply(new Book("Atomic Habits","James",3)));
		
		Predicate<Book> pred = nbook->{
			if(nbook.getTitle().endsWith("Java"))return true;
			else return false;
		};
		System.out.println(pred.test(book));
	}
}
