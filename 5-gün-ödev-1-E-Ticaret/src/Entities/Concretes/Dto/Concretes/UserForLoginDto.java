package Entities.Concretes.Dto.Concretes;

import Entities.Concretes.Dto.Abstracts.Dto;

public class UserForLoginDto implements Dto {
	private String email;
	private String password;

	public UserForLoginDto() {
		super();
	}

	public UserForLoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
