package by.htp.task8.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {

	private List<Customer> customers = new ArrayList<Customer>();

	public CustomerGroup() {

	}

	public CustomerGroup(ArrayList<Customer> customers) {

		this.customers.addAll(customers);
	}

	
	public Customer getCustomers(int i) {

		return customers.get(i);
	}

	public void setCustomers(Customer customer) {

		this.customers.add(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
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
		CustomerGroup other = (CustomerGroup) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerGroup [ customers=" + customers + "]";
	}

}
