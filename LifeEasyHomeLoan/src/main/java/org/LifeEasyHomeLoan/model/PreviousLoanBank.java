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
public class PreviousLoanBank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Integer branchId;
	
	private String branchName;
	
	private  Double branchCode;
	
	private String IFSCCode;
	
	private String MICRCode;
	
	private String BankAddress;
	
	
}
