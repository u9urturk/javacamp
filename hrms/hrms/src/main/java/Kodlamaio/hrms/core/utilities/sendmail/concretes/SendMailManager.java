package Kodlamaio.hrms.core.utilities.sendmail.concretes;

import Kodlamaio.hrms.core.utilities.sendmail.abstracts.SendMailService;

public class SendMailManager implements SendMailService {

	@Override
	public void send(int code) {
		System.out.println("Doğrulama kodu gönderildi.\n" + 
	"Code : " + code
				);
		
	}

}
