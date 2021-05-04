package Loggers;

import Services.LoggerService;

public class EmailLogger implements LoggerService {

	@Override
	public void log() {
		System.out.println("Mail gönderildi.");
		
	}

}
