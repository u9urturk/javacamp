package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.rules.abstracts.RulesService;
import eCommerce.core.utils.abstracts.MailService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserDao dao;
	private RulesService rulesService;
	private MailService mailService;
	
	public AuthManager(UserDao dao, RulesService rulesService ,MailService mailService) {
		super();
		this.dao = dao;
		this.rulesService = rulesService;
		this.mailService = mailService;
	}

	@Override
	public void register(User user) throws Exception {
		System.out.println("   ");
		user.setStatus(false);
		if(rulesService.checkMailForRegister(user) &&
				rulesService.checkIsMailUsed(user) && 
				rulesService.checkPwForRegister(user)&&
				rulesService.checkNameForRegister(user)){
			dao.save(user);
			
			System.out.println("Merhaba " + user.getFirstName()+"\n"+
			"Kay�t i�lemini tamamlamak i�in " +user.geteMail()+
			" adresli mail adresine g�nderilen linke t�klaman yeterli.");
			mailService.sendMail(user, "32dA!2sA");
		}else {
			
		}
		
	}

	@Override
	public void login(String email , String password) throws Exception {
		System.out.println(" ");
		User result =dao.getByEmail(email);
		if(result == null) {
			System.out.println("Belirtilen E-mail'e ait kay�t bulunamad�..");
		}
		else if(result.getPassword() == password) {
			System.out.println("Sisteme Ho� geldiniz " + result.getFirstName() );
			authenticateUser(result);
		}else if(result.getPassword() != password) {
			System.out.println("Parola hatal� !");
		}else {
			System.out.println("Giri� ba�ar�s�z");
		}
		
	}

	@Override
	public void register(String email, String password) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void authenticateUser(User user) throws Exception {
		
		User result = dao.getByEmail(user.geteMail());
		if(result.getStatus() == true) {
			
			System.out.println("Kullan�c� do�ruland�. �yelik tamamland�.");
		}else {
			System.out.println("Kullan�c� do�rulanamad�.\n"
					+ "�yeli�iniz hen�z tamamlanmam�� , l�tfen posta kutunuzu kontrol ediniz.");
		}
		
	}

}
