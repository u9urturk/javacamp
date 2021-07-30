package eCommerce.core.utils.abstracts;

import eCommerce.entities.concretes.User;

public interface MailService {
	
	void sendMail(User user,String message);
		
	
}
