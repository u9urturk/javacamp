package eCommerce.adapters;

import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class SimulationValidationLinkClick {
	HibernateUserDao  dao = new HibernateUserDao();
	public void click(User user) throws Exception {
		
		dao.update(user);
		
		
	}
}
