package by.htp.task8.entity;

public class CustomerBankInfo {

	private int id;
	private int cardNumber;
	private int accountNumber;

	public CustomerBankInfo() {

	}

	public CustomerBankInfo(int id, int cardNumber, int accountNumber) {

		this.id = id;
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + cardNumber;
		result = prime * result + id;
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
		CustomerBankInfo other = (CustomerBankInfo) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Card number: " + cardNumber + " Accouunt number: " + accountNumber + " ";
	}

}
