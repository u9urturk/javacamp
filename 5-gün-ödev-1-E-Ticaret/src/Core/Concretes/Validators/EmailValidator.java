package Core.Concretes.Validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.Abstracts.UserService;
import Core.Abstracts.ValidatorsService;
import Entities.Concretes.User;


public class EmailValidator implements ValidatorsService {
	
	private UserService userService;
	
	

	public EmailValidator(UserService userService) {
		super();
		this.userService = userService;
	}



	String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	boolean Ok = false;
	
	public boolean isEmailValid(User user) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		
		if(this.userService.getByEmail(user.getEmail()) != null) {
			
			System.out.println("Bu e-posta ile mevcut bir kullanýcý var ");
			return false;
		}

		if (matcher.matches() == false) {
			System.out.println("Girilen e-posta : " + user.getEmail() + "  mevcut e-posta formatýna uymamaktadýr.\n"
					+ "Örnek e-posta : u9urturk@mail.com");
			return false;
		}
		
		return true;

	}

	

	@Override
	public boolean isNameValid(User  user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
