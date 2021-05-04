package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService;

	public NeroCustomerManager(CustomerCheckService checkService) {
	
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		
		if (this.checkService.CheckIfRealPerson(customer)) {

			super.save(customer);
		} else {
			
			System.out.println("Kullanýcý Doðrulanamadý !");
		}
	}
	
}
