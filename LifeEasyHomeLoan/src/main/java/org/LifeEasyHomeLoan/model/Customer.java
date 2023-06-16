package org.LifeEasyHomeLoan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Integer customerId;
	
	
	private String customerName;
	
	private String customerDateOfBirth;
	
	private Integer customerAge;
	
	private String customerGender;
	
	private Long customerMobileNo;
	
	@OneToOne (cascade=CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	private String customerEmail;
	
	@OneToOne (cascade=CascadeType.ALL)
	private CurrentLoanDetails customerloandetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInfo propertyinfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
	@OneToOne (cascade=CascadeType.ALL)
	private Ledger ledger;
	
	@OneToOne (cascade=CascadeType.ALL)
	private SanctionLetter sanctionLetter;
	
	@OneToOne (cascade=CascadeType.ALL)
	private CustomerVerification customerverification;
	
	
	
	
	
	
	
}
