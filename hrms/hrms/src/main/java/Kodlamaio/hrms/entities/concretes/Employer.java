package Kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employers")
@Data
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="webAddress")
	private String webAddress;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="isConfirmed")
	private boolean isConfirmed;
	
	@Column(name="isVerified")
	private boolean isVerified;
	
	
	
}
