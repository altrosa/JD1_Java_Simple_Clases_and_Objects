package by.htp.task8.entity;

public class Customer {

	/*
	 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Класс
	 * Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер
	 * банковского счета. Найти и вывести: a) список покупателей в алфавитном
	 * порядке; b) список покупателей, у которых номер кредитной карточки находится
	 * в заданном интервале
	 */

	private CustomerAdress adress;
	private CustomerBankInfo bank;
	private String name;
	private String patronymic;
	private String surname;

	public Customer() {

	}

	public Customer(String surname, String name, String patronymic, CustomerAdress adress, CustomerBankInfo bank) {

		this.name = name;
		this.patronymic = patronymic;
		this.surname = surname;
		this.adress = adress;
		this.bank = bank;

	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerAdress getAdress() {
		return adress;
	}

	public void setAdress(CustomerAdress adress) {
		this.adress = adress;
	}

	public CustomerBankInfo getBank() {
		return bank;
	}

	public void setBank(CustomerBankInfo bank) {
		this.bank = bank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " \nName: " + surname + " " + name + "  " + patronymic + "\n Adress: " + adress
				+ " \n Bank information: " + bank + " ";
	}

}
