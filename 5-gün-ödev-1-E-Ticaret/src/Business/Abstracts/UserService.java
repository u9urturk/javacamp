package Business.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void verifyUser(int id);
	
	User get(int id );
	User getByEmail(String email);
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
	
}
