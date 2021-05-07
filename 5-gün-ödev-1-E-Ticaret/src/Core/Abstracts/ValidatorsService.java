package Core.Abstracts;

import Entities.Concretes.User;


public interface ValidatorsService {
	boolean isEmailValid(User user);

	boolean isNameValid(User user);
}
