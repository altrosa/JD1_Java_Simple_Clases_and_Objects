package by.htp.task8.main;

import by.htp.task8.entity.Customer;
import by.htp.task8.entity.CustomerAdress;
import by.htp.task8.entity.CustomerBankInfo;
import by.htp.task8.entity.CustomerGroup;
import by.htp.task8.logic.BankInfoLogic;
import by.htp.task8.logic.CustomerLogic;
import by.htp.task8.view.ViewCustomer;


public class Main {

	public static void main(String[] args) {

		

			Customer customer1 = new Customer("Тарасюк", "Устим", "Викторович",
						new CustomerAdress(new String[] {"Беларусь", "Брест", "Свободы", "26"}), new CustomerBankInfo(1, 1054, 1254));
			Customer customer2 = new Customer("Большакова", "Жанна", "Львовна",
						new CustomerAdress(new String[] {"Беларусь", "Брест", "Свободы", "26"}), new CustomerBankInfo(2, 1019, 4562));
			Customer customer3 = new Customer("Зварыч", "Анна", "Станиславовна",
						new CustomerAdress(new String[] {"Беларусь", "Брест", "Свободы", "26"}), new CustomerBankInfo(3, 6594, 5441));
			Customer customer4 = new Customer("Легойда", "Борис", "Григорьевич",
						new CustomerAdress(new String[] {"Беларусь", "Брест", "Свободы", "26"}), new CustomerBankInfo(4, 1257, 3597));
			Customer customer5 = new Customer("Смирнов", "Павел", "Анатольевич",
						new CustomerAdress(new String[] {"Беларусь", "Брест", "Свободы", "26"}), new CustomerBankInfo(5, 1024, 6317));
		
		CustomerGroup customers = new CustomerGroup();
		
		customers.getCustomers().add(customer1);
		customers.getCustomers().add(customer2);
		customers.getCustomers().add(customer3);
		customers.getCustomers().add(customer4);
		customers.getCustomers().add(customer5);
		
	    customers.getCustomers().sort(CustomerLogic.sortByName);
	    
	    ViewCustomer print = new ViewCustomer();
	    
	    print.print(customers);
	    
	   CustomerGroup cardRange = new BankInfoLogic().cardMinMax(customers, 1054, 1257);
	 
	   print.print(cardRange);
		
		
		
	}
}
