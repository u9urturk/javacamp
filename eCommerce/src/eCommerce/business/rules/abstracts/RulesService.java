package eCommerce.business.rules.abstracts;

import eCommerce.entities.concretes.User;

public interface RulesService {
	
	public boolean checkIsMailUsed(User user) throws Exception;
	
	public boolean checkMailForRegister(User user);
	
	public boolean checkPwForRegister(User user);
	
	public boolean checkMailForExternal(String email);
	
	public boolean checkNameForRegister(User user); 
}
