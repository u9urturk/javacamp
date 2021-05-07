package Business.Concretes;

import Business.Abstracts.AuthService;
import Business.Abstracts.UserService;
import Core.Abstracts.SendMailService;
import Core.Abstracts.ValidatorsService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;
import Entities.Concretes.Dto.Concretes.UserForLoginDto;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public class AuthManager implements AuthService {

	private ValidatorsService validatorsServiceEmail;
	private ValidatorsService validatorsServiceName;
	private UserService userService;
	private SendMailService sendMailService;
	private UserDao userDao;

	public AuthManager(ValidatorsService validatorsServiceEmail, ValidatorsService validatorsServiceName,
			UserService userService , SendMailService sendMailService) {
		super();
		this.validatorsServiceEmail = validatorsServiceEmail;
		this.validatorsServiceName = validatorsServiceName;
		this.userService = userService;
		this.sendMailService = sendMailService;
	
	}

	@Override
	public void register(UserForRegisterDto forRegisterDto,int id) {
		User userToRegister = 
				new User(id,forRegisterDto.getFirstName(),
						forRegisterDto.getLastName(),
						forRegisterDto.getEmail(),
						forRegisterDto.getPassword(),false);
		if (this.validatorsServiceEmail.isEmailValid(userToRegister) && this.validatorsServiceName.isNameValid(userToRegister)) {
			
			this.sendMailService.send(forRegisterDto);
			this.userService.add(userToRegister);
			System.out.println("*********************************************************************************\n"
					+ "\nKay�t i�leminizin tamamlanabilmesi i�in E-Posta adresinize yollanan linke t�klay�n�z.");
		}

	}

	@Override
	public void login(UserForLoginDto forLoginDto) {
		
		var result = this.userDao.getByEmailAndPassword(forLoginDto.getEmail(), forLoginDto.getPassword());
		
		if(result !=null) {
			
			System.out.println("Giri� i�lemi ba�ar�yla ger�ekle�ti\n" +
					"Ho� geldin  " + result.getFirstName());
					
					
		}else {
			System.out.println("B�yle bir kullan�c� sistemde kay�tl� de�il");
		}
		
		

	}

	@Override
	public void register(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	

}
