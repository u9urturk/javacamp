package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;


public interface UserDao {
	void add(User user);
	
	void delete(User user);
	
	void update(User user);
	
	User getById(int id);
	
	User getByEmail(String email);
	
	User getByEmailAndPassword(String email, String password);
	
	List<User> getAll();
}
