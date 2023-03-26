package service;

import java.util.ArrayList;
import java.util.List;

import dao.BuildingDAO;
import dao.CustomerDAO;
import dao.CustomerDAOInterface;
import model.BuildingSearchOutput;
import model.CustomerSearchInput;
import model.CustomerSearchOutput;

public class CustomerSERVICEInterface implements SERVICEInterface<CustomerSearchInput, CustomerSearchOutput>{

	public static CustomerSERVICEInterface getInstance() {
		return new CustomerSERVICEInterface();
	}
	@Override
	public List<CustomerSearchOutput> selectBy(CustomerSearchInput customerSearchInput) {
		
		CustomerDAO customerDao = new CustomerDAO(null,customerSearchInput.getFullname(),
				customerSearchInput.getPhone(),null,null,null,null,null);
		
		List<CustomerDAO> customerDAOs = CustomerDAOInterface.getInstance().selectBy(customerDao);
		
		List<CustomerSearchOutput> results = new ArrayList<>();
		
		for(CustomerDAO item: customerDAOs) {
			CustomerSearchOutput  customerSearchOutput = new CustomerSearchOutput();
			String firstname= item.getFullname().substring(item.getFullname().lastIndexOf(' ')+1);
			String lastname=item.getFullname().substring(0,item.getFullname().lastIndexOf(' '));
			customerSearchOutput.setFirstname(firstname);
			customerSearchOutput.setLastname(lastname);
			customerSearchOutput.setPhone(item.getPhone());
			customerSearchOutput.setEmail(item.getEmail());
			results.add(customerSearchOutput);
		}
		return results;
	}
	
	public static void main(String[] args) {
		System.out.println(CustomerSERVICEInterface.getInstance().selectBy(new CustomerSearchInput("An",null))  );
	}
}
