package by.htp.task8.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task8.entity.Customer;
import by.htp.task8.entity.CustomerGroup;

public class BankInfoLogic {

	public CustomerGroup cardMinMax(CustomerGroup group, int min, int max) {

		List<Customer> customers = group.getCustomers();
		
		ArrayList<Customer> cardInter = new ArrayList<Customer>();

		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getBank().getCardNumber() >= min
					&& customers.get(i).getBank().getCardNumber() <= max) {
				cardInter.add(customers.get(i));
			}

		}

		CustomerGroup cardRange = new CustomerGroup(cardInter);

		return cardRange;
	}

}
