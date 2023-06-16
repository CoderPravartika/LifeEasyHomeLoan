package org.LifeEasyHomeLoan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class MortgageDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer mortgageId;
	
	
	private Double mortgagePropertyValue;
	
	@Lob
	private byte[] mortgagePropertyProof;
	
	
	private String mortgagetype;
	
	private Double mortgageLoanOnProperty;
	
	@Lob
	private byte[] mortgagePopertyInsurance;
	
	
}
