package Core.Abstracts;

import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public interface SendMailService {
	void send(UserForRegisterDto forRegisterDto);

}
