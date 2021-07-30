package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void update(User user);
	
	void delete(User user);
}
