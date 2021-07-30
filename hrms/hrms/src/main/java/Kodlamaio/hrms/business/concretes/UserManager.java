package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.UserService;
import Kodlamaio.hrms.core.utilities.businessRules.BusinessRules;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.core.validators.abstracts.ValidatorsService;
import Kodlamaio.hrms.core.validators.concretes.EmailValidatorsManager;
import Kodlamaio.hrms.dataAccess.abstracts.UserDao;
import Kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailValidatorsManager emailValidate;
	
	
	protected UserManager(EmailValidatorsManager emailValidate) {
		super();
		this.emailValidate = emailValidate;
	}

	@Autowired
	public UserManager(UserDao userDao  ) {
		super();
		this.userDao = userDao;
		
		
		
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>( this.userDao.findAll(),"OK");
	}

	@Override
	public DataResult<User> getByUserId(int userId) {
		return new SuccessDataResult<User>(this.userDao.getOne(userId));
	}

	@Override
	public Result add(User user) {
		BusinessRules.run(this.emailValidate.isEmailValid(user));
		//this.userDao.save(user);
		return new SuccessResult(true,"Kullanıcı eklendi");
		
	}

	@Override
	public Result delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult(true,"Kullanıcı silindi");
		
	}

	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult(true,"Kullanıcı güncellendi");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
		
	}

}
