package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.SystemWorker;
import Kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	
	DataResult<List<User>> getAll();
	
	DataResult<User> getByUserId(int userId);
	
	DataResult<User> getByEmail(String email);
	
	
	Result add(User user);
	
	Result delete(User user);
	
	Result update (User user);
	
	
	
}
