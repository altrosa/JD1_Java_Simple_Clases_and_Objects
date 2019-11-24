package by.htp.task9.view;

import java.util.List;

import by.htp.task9.entity.Book;

public class BookView {

	public void viewBook(List<Book> books) {

		if (books.size() > 0) {
			for (int i = 0; i < books.size(); i++) {

				System.out.println("ID: " + books.get(i).getId());
				System.out.println("Title: " + books.get(i).getTitle());
				System.out.println("Author(s): " + books.get(i).getAuthor());
				System.out.println("Publisher: " + books.get(i).getPublishing());
				System.out.println("Publishing Year: " + books.get(i).getYear());
				System.out.println("Page Quantity: " + books.get(i).getPageQuantity());
				System.out.println("Price: " + books.get(i).getPrice());
				System.out.println("Binding Type: " + books.get(i).getBindingType());
				System.out.println("---------------");
			}

		} else {

			System.out.println("Can't find this book!");
		}

	}

}
