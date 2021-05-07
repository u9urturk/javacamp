package Adapters;

import Business.Abstracts.AuthService;
import Entities.Concretes.Dto.Concretes.UserForLoginDto;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;
import GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	GoogleAuthManager google = new GoogleAuthManager();
	@Override
	public void register(UserForRegisterDto forRegisterDto, int id) {
		google.register(forRegisterDto.getEmail(), forRegisterDto.getPassword());
		
	}

	@Override
	public void login(UserForLoginDto forLoginDto) {

		google.login(forLoginDto.getEmail(), forLoginDto.getPassword());
		
	}

	@Override
	public void register(String email, String password) {
		google.register(email,password);
		
	}

	

}
