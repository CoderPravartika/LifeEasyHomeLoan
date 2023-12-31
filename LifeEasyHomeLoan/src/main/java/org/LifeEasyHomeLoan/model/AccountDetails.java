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
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

    private Integer accountId;
	
	private Long accountNumber;
	
	
	private String accountType;
	
	private Double accountBalance;
	
	private String accountHolderName;
	
	private String accountStatus;
	
	
}
