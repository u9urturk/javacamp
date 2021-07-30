package eCommerce.core.utils.concretes;

import eCommerce.core.utils.abstracts.MailService;
import eCommerce.entities.concretes.User;

public class MailManager implements MailService{

	@Override
	public  void sendMail(User user, String message) {
		System.out.println(" ");
		System.out.println("Kullanýcý : " + user.geteMail() +"\n"+
		"Doðrulama kodu : " + message);
		
	}

	

}
