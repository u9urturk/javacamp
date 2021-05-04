package Loggers;

import Services.LoggerService;

public class DatabaseLogger implements LoggerService {

	@Override
	public void log() {
		System.out.println("Veri veri tabanýna loglandý");		
	}

}
