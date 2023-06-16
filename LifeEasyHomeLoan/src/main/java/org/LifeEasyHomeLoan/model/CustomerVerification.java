package org.LifeEasyHomeLoan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class CustomerVerification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer verificationID;
	private String verificationDate;
	private String status;
	
}
