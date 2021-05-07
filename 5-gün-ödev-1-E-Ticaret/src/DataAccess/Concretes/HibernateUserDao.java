package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements UserDao {
	
	 List<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		users.add(user);
//		System.out.println(user.getEmail());
//		System.out.println("Ok");
//		this.getAll();
	}

	@Override
	public void delete(User user) {
		users.removeIf(u->u.getId() == user.getId());
		
	}
	@Override
	public void update(User user) {
		User userToUpdate = getById(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		
	}

	@Override
	public User getById(int id) {
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
			
		}
		
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user:users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for(User user:users) {
			if(user.getEmail() == email && user.getPassword() == password) {
				return user;
			}
		}
		
		return null;
	}

}
