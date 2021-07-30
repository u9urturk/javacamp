package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	static List<User> userList = new ArrayList<User>();
	@Override
	public void save (User user) {
		
		userList.add(user);
		
	}

	@Override
	public void update(User user) {
		
		for(User use:userList) {
			if(use.geteMail() == user.geteMail()) {
				User result = use;
				result.setStatus(true);
			}
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) throws Exception {
		
		for(User us: userList) {
			
			if(us.geteMail() == email) {
				return us;
			}
		}
		//System.out.println("Belirtilen E-mail'e ait kayýt bulunamadý..");
		return null;
		
		
		
	}
			
	

}
