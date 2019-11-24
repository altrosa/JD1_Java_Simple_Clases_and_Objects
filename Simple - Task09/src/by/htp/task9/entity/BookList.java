package by.htp.task9.entity;

import java.util.ArrayList;
import java.util.List;

import by.htp.task9.entity.Book;

public class BookList {

	private List<Book> books = new ArrayList<Book>();

	public BookList() {

	}

	public BookList(ArrayList<Book> books) {

		this.books.addAll(books);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookList other = (BookList) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookList [books=" + books + "]";
	}

}
