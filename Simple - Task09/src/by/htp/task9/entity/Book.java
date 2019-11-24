package by.htp.task9.entity;

public class Book {

	/*
	 * 9. Создать класс Book, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Book: id,
	 * название, автор(ы), издательство, год издания, количество страниц, цена, тип
	 * переплета. Найти и вывести: a) список книг заданного автора; b) список книг,
	 * выпущенных заданным издательством; c) список книг, выпущенных после заданного
	 * года.
	 */

	private int id;
	private String title;
	private String author;
	private String publishing;
	private int year;
	private int pageQuantity;
	private int price;
	private String bindingType;

	public Book() {

	}

	public Book(int id, String title, String author, String publishing, int year, int pageQuantity, int price,
			String bindingType) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.year = year;
		this.pageQuantity = pageQuantity;
		this.price = price;
		this.bindingType = bindingType;
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

	public void setAutor(String author) {
		this.author = author;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPageQuantity() {
		return pageQuantity;
	}

	public void setPageQuantity(int pageQuantity) {
		this.pageQuantity = pageQuantity;
	}

	public int getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + pageQuantity;
		result = prime * result + price;
		result = prime * result + ((publishing == null) ? 0 : publishing.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (pageQuantity != other.pageQuantity)
			return false;
		if (price != other.price)
			return false;
		if (publishing == null) {
			if (other.publishing != null)
				return false;
		} else if (!publishing.equals(other.publishing))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishing=" + publishing + ", year="
				+ year + ", pageQuantity=" + pageQuantity + ", price=" + price + ", bindingType=" + bindingType + "]";
	}

}
