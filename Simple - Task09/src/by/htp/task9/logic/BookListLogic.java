package by.htp.task9.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task9.entity.Book;

public class BookListLogic {

	public List<Book> takeAuthorBook(List<Book> books, String author) {

		List<Book> takeAuthorBook = new ArrayList<Book>();

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor().equals(author)){
				takeAuthorBook.add(books.get(i));
			}
		}

		return takeAuthorBook;
	}

	public List<Book> takePublishingBook(List<Book> books, String publishing) {

		List<Book> takePublishingBook = new ArrayList<Book>();

		for (int i = 0; i < books.size(); i++) {

			if (books.get(i).getPublishing().equals(publishing)) {

				takePublishingBook.add(books.get(i));
			}
		}
		return takePublishingBook;
	}

	public List<Book> searchPublishingYear(List<Book> books, int year) {

		List<Book> searchPublishingYear = new ArrayList<Book>();

		for (int i = 0; i < books.size(); i++) {

			if (books.get(i).getYear() >= year) {

				searchPublishingYear.add(books.get(i));
			}
		}
		return searchPublishingYear;
	}
}
