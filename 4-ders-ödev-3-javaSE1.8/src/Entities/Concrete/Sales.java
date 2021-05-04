package Entities.Concrete;

import java.sql.Date;
import java.time.LocalDate;

import Entities.Abstract.Entity;

public class Sales implements Entity {
	
	private int id;
	private int customerId;
	private String customerName;
	private int customerDateOfBirth;
	private int gameId;
	private String gameName;
	private LocalDate sellBy;
	private int price;
	
	
	public Sales() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}


	public void setCustomerDateOfBirth(int customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public LocalDate getSellBy() {
		return sellBy;
	}


	public void setSellBy(LocalDate date) {
		this.sellBy = date;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	
	
	
	
	
}
