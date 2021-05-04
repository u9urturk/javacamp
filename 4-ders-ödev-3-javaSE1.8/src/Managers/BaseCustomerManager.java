package Managers;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;
import Services.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void add(Customer customer) throws RemoteException {
		System.out.println(customer.getFirstName() + " isimli m��teri sisteme kay�t edildi." );
		
	}
	
	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli m��teri sistemden silindi" );
		
	}
	
	@Override
	public void update(Customer customer) {
		System.out.println("Bilgiler g�ncellendi." );
		
	}
}
