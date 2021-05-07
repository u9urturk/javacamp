package Business.Concretes;

import java.util.List;

import Business.Abstracts.UserService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
	
	 UserDao userDao;
	
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void verifyUser(int id) {
		User user = userDao.getById(id);
		user.setVerification(true);
		System.out.println("Doðrulama iþlemin tamamlandý. Aramýza hoþ geldin " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
	
		return userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		
		return userDao.getByEmail(email);
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		return userDao.getByEmailAndPassword(email, password);
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
