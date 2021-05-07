package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements UserDao {
	
	 private List<User> users ;
	 
	
	
	public HibernateUserDao() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
//		System.out.println(user.getEmail());
//		System.out.println("Ok");
		getAll();
	}

	@Override
	public void delete(User user) {
		this.users.removeIf(u->u.getId() == user.getId());
		
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
		for(User user:this.users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.users.stream().collect(Collectors.toList());
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for(User user:this.users) {
			if(user.getEmail() == email && user.getPassword() == password) {
				return user;
			}
		}
		
		return null;
	}

}
