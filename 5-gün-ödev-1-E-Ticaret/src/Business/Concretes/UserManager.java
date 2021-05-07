package Business.Concretes;

import java.util.List;

import Business.Abstracts.UserService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
	
	 private UserDao userDao;
	
	

	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		this.userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void verifyUser(int id) {
		User user = userDao.getById(id);
		if(user != null) {
			user.setVerification(true);
			System.out.println("Doðrulama iþlemin tamamlandý. Aramýza hoþ geldin " + user.getFirstName());
		}
		
		//System.out.println("Doðrulama iþlemin tamamlandý. Aramýza hoþ geldin " );
		
	}

	@Override
	public User get(int id) {
	
		return this.userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		
		return this.userDao.getByEmail(email);
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		return this.userDao.getByEmailAndPassword(email, password);
		
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

}
