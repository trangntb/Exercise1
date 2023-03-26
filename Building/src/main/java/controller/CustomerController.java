package controller;

import java.util.List;

import model.CustomerSearchInput;
import model.CustomerSearchOutput;
import service.CustomerSERVICEInterface;

public class CustomerController {
	public List<CustomerSearchOutput> selectBy(CustomerSearchInput customerSearchInput) {
		List<CustomerSearchOutput> results = CustomerSERVICEInterface.getInstance().selectBy(customerSearchInput);
		return results;
	}
}
