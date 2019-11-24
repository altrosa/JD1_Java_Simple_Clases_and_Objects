package by.htp.task8.view;

import by.htp.task8.entity.Customer;
import by.htp.task8.entity.CustomerGroup;

public class ViewCustomer {

	public void printCustomer(Customer customer) {
		
		ViewAdress adress = new ViewAdress();
		ViewBankInfo bank = new ViewBankInfo();
		
		adress.printAdress(customer);
		bank.printBank(customer);
	}
	
	public void printCustomer(CustomerGroup customers) {
		
		customers.getCustomers().forEach(customer -> printCustomer(customer));
	}
	
	public void print(CustomerGroup customers) {
		
		System.out.println(customers.getCustomers());
	}
}
