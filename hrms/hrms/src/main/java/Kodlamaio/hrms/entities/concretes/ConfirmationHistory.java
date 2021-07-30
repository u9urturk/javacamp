package Kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Table(name = "confirmation_history")
@Data
public class ConfirmationHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "is_confirmed_company")
	private String isConfirmedCompany;
	
	@Column(name = "confirming_staff_code")
	private String confirmingStaffCode;
	
}
