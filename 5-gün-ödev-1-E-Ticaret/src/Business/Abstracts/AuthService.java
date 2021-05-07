package Business.Abstracts;

import Entities.Concretes.Dto.Concretes.UserForLoginDto;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public interface AuthService {
	void register(UserForRegisterDto forRegisterDto,int id);
	void register(String email , String password) ;

	void login(UserForLoginDto forLoginDto);
	

}
