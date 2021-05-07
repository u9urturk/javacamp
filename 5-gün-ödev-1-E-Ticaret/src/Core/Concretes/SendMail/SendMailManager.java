package Core.Concretes.SendMail;

import Core.Abstracts.SendMailService;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public class SendMailManager implements SendMailService {

	@Override
	public void send(UserForRegisterDto forRegisterDto) {
		System.out.println("Do�rulama linki ilgili mail adresine g�nderildi \n  " +
	"G�nderilen adres : " + forRegisterDto.getEmail());
		
	}

}
