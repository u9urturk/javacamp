package Kodlamaio.hrms.core.validators.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Kodlamaio.hrms.business.abstracts.UserService;
import Kodlamaio.hrms.core.utilities.results.ErrorResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.core.validators.abstracts.ValidatorsService;
import Kodlamaio.hrms.entities.concretes.JobSeeker;
import Kodlamaio.hrms.entities.concretes.User;

public class EmailValidatorsManager implements ValidatorsService {
	
	private UserService userService;
	
	protected EmailValidatorsManager(UserService userService) {
		super();
		this.userService = userService;
	}

	String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	boolean Ok = false;

	@Override
	public Result isEmailValid(User user) {
		
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		
		if(this.userService.getByEmail(user.getEmail()) != null) {
			
			//System.out.println("Bu e-posta ile mevcut bir kullanıcı var ");
			return new ErrorResult(true, "Bu e-posta ile mevcut bir kullanıcı var");
			
		}

		if (matcher.matches() == false) {
			//System.out.println("Girilen e-posta : " + user.getEmail() + "  mevcut e-posta formatına uymamaktadır.\n"
				//	+ "Örnek e-posta : u9urturk@mail.com");
			return new ErrorResult(true, "Girilen e-posta : \" + user.getEmail() + \"  mevcut e-posta formatına uymamaktadır.\\n\"\r\n"
					+ "					+ \"Örnek e-posta : u9urturk@mail.com");
		}
		
		return new SuccessResult();
		
		
	}

	@Override
	public Result isNationalityIdentityVerification(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return new SuccessResult();
	}

}
