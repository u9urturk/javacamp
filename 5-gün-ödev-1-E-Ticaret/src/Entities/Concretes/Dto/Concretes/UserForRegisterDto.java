package Entities.Concretes.Dto.Concretes;

import Entities.Concretes.Dto.Abstracts.Dto;

public class UserForRegisterDto implements Dto {
	private String email;
	private String firstName;
	private String lastName;
	private String password;

	public UserForRegisterDto() {
		super();
	}

	public UserForRegisterDto(String email, String firstName, String lastName, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
