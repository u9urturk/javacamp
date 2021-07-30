package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface AuthService {
	
	void register(User user) throws Exception;
	
	void register(String email , String password) throws Exception;
	
	void login (String email , String password) throws Exception;
	
	void authenticateUser(User user) throws Exception;
}
