package Services;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
