package eCommerce.adapters;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.rules.concretes.StandardRulesManager;
import eCommerce.entities.concretes.User;
import googleService.GoogleAuthManager;

public class GoogleAuthManagerAdapters implements AuthService {
	
	GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	StandardRulesManager manager = new StandardRulesManager();
	@Override
	public void register(User user) throws Exception {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String email, String password) throws Exception {
		
		googleAuthManager.loginWithGoogle(email, password);
		
	}

	@Override
	public void register(String email , String password) throws Exception {
		User user = new User();
		user.seteMail(email);
		user.setPassword(password);
		if(manager.checkIsMailUsed(user)&& manager.checkMailForRegister(user)){
			
			googleAuthManager.registerWithGoogle(email, password);
		}else {
			return;
		}
		
		
	}

	@Override
	public void authenticateUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
