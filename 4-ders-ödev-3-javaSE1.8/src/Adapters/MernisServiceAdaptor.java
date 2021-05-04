package Adapters;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;
import Services.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
	}

}
