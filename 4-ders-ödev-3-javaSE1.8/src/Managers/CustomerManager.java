package Managers;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;
import Services.CustomerCheckService;
import Services.CustomerService;
import Services.LoggerService;

public class CustomerManager extends BaseCustomerManager  {
	 
	private CustomerCheckService checkService;
	
	private LoggerService loggerService;

	public CustomerManager(CustomerCheckService checkService , LoggerService loggerService) {
		
		this.checkService = checkService;
		this.loggerService = loggerService ; 
	}
	
	
	



	@Override
	public void add(Customer customer) throws RemoteException {
		if(this.checkService.checkIfRealPerson(customer)) {
			super.add(customer);
			this.loggerService.log();
		}else {
			System.out.println("Kullanýcý doðrulanamadý ! ");
		}
		
	}
	
	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		super.delete(customer);
		this.loggerService.log();
	}
	
	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		super.update(customer);
		this.loggerService.log();
	}

	

}
