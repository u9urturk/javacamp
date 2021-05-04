package Entities.Concrete;

import java.text.DecimalFormat;

import Entities.Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String gameName;
	private int price;
	
	public Game() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
