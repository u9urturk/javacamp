package Managers;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;
import Services.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void add(Customer customer) throws RemoteException {
		System.out.println(customer.getFirstName() + " isimli müþteri sisteme kayýt edildi." );
		
	}
	
	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli müþteri sistemden silindi" );
		
	}
	
	@Override
	public void update(Customer customer) {
		System.out.println("Bilgiler güncellendi." );
		
	}
}
