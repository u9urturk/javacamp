import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Uður");
		customer.setLastName("Türk");
		customer.setDateOfBirth(1998);
		customer.setNationalityId("40363826282");
		customerManager.save(customer);

	}



}
