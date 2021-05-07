package Core.Concretes.Validators;

import Core.Abstracts.ValidatorsService;
import Entities.Concretes.User;


public class NameValidator implements ValidatorsService {

	

	@Override
	public boolean isNameValid(User user) {

		 if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
			 System.out.println("Kayýt iþlemi baþarýsýz , Ad - Soyad en az iki karakterden oluþmalýdýr.");
			 return false;
		 }else if(user.getPassword().length() < 6 ) {
			 System.out.println("Kayýt iþlemi baþarýsýz , parola en az 6 karakterden oluþmalýdýr. ");
			 return false;
		 }
		 
		 
		 
		 return true;

	}

	@Override
	public boolean isEmailValid(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
