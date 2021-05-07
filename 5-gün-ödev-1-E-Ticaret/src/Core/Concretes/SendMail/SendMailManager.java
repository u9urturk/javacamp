package Core.Concretes.SendMail;

import Core.Abstracts.SendMailService;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public class SendMailManager implements SendMailService {

	@Override
	public void send(UserForRegisterDto forRegisterDto) {
		System.out.println("Doðrulama linki ilgili mail adresine gönderildi \n  " +
	"Gönderilen adres : " + forRegisterDto.getEmail());
		
	}

}
