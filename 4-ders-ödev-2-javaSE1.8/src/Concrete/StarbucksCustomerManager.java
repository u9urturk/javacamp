package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (this.customerCheckService.CheckIfRealPerson(customer)) {

			super.save(customer);
		} else {
			
			System.out.println("Kullanýcý Doðrulanamadý !");
		}

	}
}
