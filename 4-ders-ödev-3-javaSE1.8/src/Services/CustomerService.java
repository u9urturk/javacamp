package Services;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;

public interface CustomerService {
	
	void add(Customer customer) throws RemoteException;
	
	void delete(Customer customer);
	
	void update(Customer customer);
}
