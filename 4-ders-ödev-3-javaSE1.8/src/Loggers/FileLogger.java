package Loggers;

import Services.LoggerService;

public  class FileLogger implements LoggerService {

	@Override
	public void log() {
		System.out.println("Veri dosyaya loglandý");
	}

}
