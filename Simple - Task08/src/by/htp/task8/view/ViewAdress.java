package by.htp.task8.view;

import by.htp.task8.entity.Customer;
import by.htp.task8.entity.CustomerAdress;
import by.htp.task8.entity.CustomerGroup;

public class ViewAdress {
	
	public void printAdress(Customer customer) {
		
		printAdress(customer.getAdress());
	}
	
	public void printAdress(CustomerGroup customers) {
		
		customers.getCustomers().forEach(customer -> printAdress(customer.getAdress()));
	}
	
	public void printAdress(CustomerAdress adress) {
		
		System.out.println("County" + adress.getCountry() + ", City: " + adress.getCity() + ", Street: " + adress.getStreet() + ", House:  " + adress.getHouseNumber());
	}

}
