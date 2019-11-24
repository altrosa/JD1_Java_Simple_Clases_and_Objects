package by.htp.task8.logic;

import java.util.Comparator;

import by.htp.task8.entity.Customer;

public class CustomerLogic implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {

		return (o1.getName().toString()).compareTo(o2.getName().toString());

	}
	
	public static Comparator<Customer> sortByName = new Comparator<Customer>() {

		@Override
		public int compare(Customer e1, Customer e2) {
			return (e1.getName().toString()).compareTo(e2.getName().toString());
		}
	};
}
