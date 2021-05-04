package Managers;

import Entities.Concrete.Game;
import Services.GameService;
import Services.LoggerService;

public class GameManager implements GameService {
	
	LoggerService loggerService;
	

	public GameManager(LoggerService loggerService) {
		
		this.loggerService = loggerService;
	}

	@Override
	public void add(Game game) {
		
		System.out.println("******************************************\n"+"Oyun eklendi : " + game.getGameName());
		this.loggerService.log();
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi");
		this.loggerService.log();
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi");
		this.loggerService.log();
		
	}

}
