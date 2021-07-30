package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
	
	void save(User user);
	
	void update(User user);
	
	void delete(User user);
	
	
	User getById(int id);
	
	User getByEmail(String email) throws Exception;
	
	List<User> getAll();
}
