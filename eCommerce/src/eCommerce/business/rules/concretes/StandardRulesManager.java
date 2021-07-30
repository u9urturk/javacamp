package eCommerce.business.rules.concretes;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.rules.abstracts.RulesService;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class StandardRulesManager implements RulesService {
	HibernateUserDao dao = new HibernateUserDao();
	@Override
	public boolean checkIsMailUsed(User user) throws Exception {
		
		if(dao.getByEmail(user.geteMail()) == null) {
			
			return true;
		}else {
			System.out.println("Kay�t ba�ar�s�z ! , Bu E-mail kullan�mda.");
			return false; 
		}
	}

	@Override
	public boolean checkMailForRegister(User user) {
		String emailPattern=
				"^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
		Pattern pattern =Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(matcher.find()) {
			return true;
		}else {
			System.out.println("Kay�t Ba�ar�s�z ! , E-mail adresiniz ge�ersiz");
			return false;
			
		}
	}

	@Override
	public boolean checkPwForRegister(User user) {
		
		if(user.getPassword().length() >= 6) {
			return true;
		}else {
			
			System.out.println("Kay�t ba�ar�s�z ! , Parolana ez az 6 karakter olmal�d�r...");
			return false;
		}
		
	}

	@Override
	public boolean checkMailForExternal(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkNameForRegister(User user) {
		
		if(user.getFirstName().length() >=2 && user.getLastName().length() >=2) {
			return true;
		}else {
			System.out.println("Kay�t ba�ar�s�z ! ,�sim ve Soy isim en az iki karakterden olu�mal�d�r. ");
			return false;
		}
	}

}
