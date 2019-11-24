package by.htp.task9.main;

import java.util.List;

import by.htp.task9.entity.Book;
import by.htp.task9.entity.BookList;
import by.htp.task9.logic.BookListLogic;
import by.htp.task9.view.BookView;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book(2756, "Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006, 1150, 70, "Paperback");
		Book book2 = new Book(1347, "Head First Java", "Bert Bates, Kathy Sierra", "O'Reilly", 2019, 718, 55,
				"Hardback");
		Book book3 = new Book(4593, "Java: A Beginner’s Guide", "Herbert Schildt", "McGraw-Hill Education", 2015, 1450,
				180, "Hardback");
		Book book4 = new Book(2348, "Java Concurrency in Practice", "Brian Goetz with Tim Peierls",
				"Addison-Wesley Professional", 2000, 1200, 99, "Paperback");
		Book book5 = new Book(1597, "Java Performance: The Definite Guide", "Scott Oaks", "Shroff/O’Reilly", 2005, 850,
				70, "Paperback");

		BookList books = new BookList();

		books.getBooks().add(book1);
		books.getBooks().add(book2);
		books.getBooks().add(book3);
		books.getBooks().add(book4);
		books.getBooks().add(book5);

		BookView view = new BookView();

		// view.viewBook(books.getBooks());

		BookListLogic logic = new BookListLogic();

		// Поиск по автору.
		List<Book> takeAutorBook = logic.takeAuthorBook(books.getBooks(), "Bruce Eckel");
		view.viewBook(takeAutorBook);

		// Поиск по издательству.
		List<Book> takePublishingBook = logic.takePublishingBook(books.getBooks(), "O'Reilly");
		view.viewBook(takePublishingBook);

		// Поиск, начиная с заданного года выпуска.
		List<Book> searchPublishingYear = logic.searchPublishingYear(books.getBooks(), 2014);
		view.viewBook(searchPublishingYear);

	}

}
