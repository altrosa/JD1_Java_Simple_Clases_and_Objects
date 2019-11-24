package by.htp.task8.view;

import by.htp.task8.entity.Customer;
import by.htp.task8.entity.CustomerBankInfo;
import by.htp.task8.entity.CustomerGroup;

public class ViewBankInfo {
	
	
	public void printBank(Customer customer) {
	
		printBank(customer.getBank());
	}

	public void printBank(CustomerGroup customers) {
		
		customers.getCustomers().forEach(customer -> printBank(customer.getBank()));
	}
	
	public void printBank(CustomerBankInfo info) {

		System.out.println("ID: " + info.getId() + "| Account Number: " + info.getAccountNumber() + "| Card Number: "
				+ info.getCardNumber());
	}

}
