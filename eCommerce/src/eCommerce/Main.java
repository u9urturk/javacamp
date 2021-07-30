package eCommerce;

import eCommerce.adapters.SimulationValidationLinkClick;
import eCommerce.business.abstracts.AuthService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.rules.concretes.StandardRulesManager;
import eCommerce.core.utils.concretes.MailManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Uður");
		user.setLastName("Türk");
		user.seteMail("test@mail.com");
		user.setPassword("123456");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Uður 2");
		user2.setLastName("Türk");
		user2.seteMail("test@mail.com");
		user2.setPassword("123456");
		
		
		AuthService service = new AuthManager(new HibernateUserDao(),
				new StandardRulesManager(),new MailManager());
		
		service.register(user);
		service.register(user2);
		
		service.login("tes@mail.com", "121");
		service.login("test@mail.com", "121");
		service.login("test@mail.com", "123456");
		
		
		SimulationValidationLinkClick click = new SimulationValidationLinkClick();
		click.click(user2);
		service.login("test@mail.com", "123456");	
		
		
		
		

	}

}
