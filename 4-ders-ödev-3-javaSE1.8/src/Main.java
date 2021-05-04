import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Date;

import Adapters.MernisServiceAdaptor;
import Campaigns.ageCampaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Game;
import Entities.Concrete.Sales;
import Loggers.DatabaseLogger;
import Loggers.EmailLogger;
import Loggers.FileLogger;
import Managers.CustomerCheckManager;
import Managers.CustomerManager;
import Managers.GameManager;
import Managers.SalesManager;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Uður");
		customer.setLastName("Türk");
		customer.setNationalityId("Tc No");
		customer.setDateOfBirth("Yýl");
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdaptor(),new FileLogger());
		customerManager.add(customer);
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Watch Dogs 2");
		game.setPrice(200);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Watch Dogs ");
		game2.setPrice(100);
		
		GameManager gameManager = new GameManager(new DatabaseLogger());
		gameManager.add(game);
		
		LocalDate date = LocalDate.now();
		Sales sales = new Sales();
		sales.setId(1);
		sales.setCustomerId(customer.getId());
		sales.setGameId(game.getId());
		sales.setGameName(game.getGameName());
		sales.setCustomerName(customer.getFirstName() +" "+ customer.getLastName());
		sales.setCustomerDateOfBirth(customer.getDateOfBirth());
		sales.setPrice(game.getPrice());
		sales.setSellBy(date);
		
		SalesManager salesManager = new SalesManager(new ageCampaign(),new EmailLogger());
		salesManager.sell(sales);
		

	}

}
