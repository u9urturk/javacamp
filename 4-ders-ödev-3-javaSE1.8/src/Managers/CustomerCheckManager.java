package Managers;

import Entities.Concrete.Customer;
import Services.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

	
	

}
