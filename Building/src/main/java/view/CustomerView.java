package view;

import java.util.List;

import controller.CustomerController;
import model.BuildingSearchOutput;
import model.CustomerSearchInput;
import model.CustomerSearchOutput;

public class CustomerView {

	//list Customer
	public static void customerList() {
		CustomerSearchInput customerSearchInput = new CustomerSearchInput("An",null);

		CustomerController customerController = new CustomerController();
		List<CustomerSearchOutput> customers = customerController.selectBy(customerSearchInput);

		//in customers
		//System.out.println(customers);
		for(CustomerSearchOutput item:customers)
			System.out.println(item.toString());
	}
	public static void main(String[] args) {
		customerList();
	}

}
