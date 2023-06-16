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
public class PreviousLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer previousLoanId;
	
	private Double previousLoanAmount;
	
	private Integer previousLoanTenure;
	
	private Double previousLoanPaidAmount;
	
	private Double previousLoanRemainingAmount;

	
	private String previousLoanstatus;
	
	private PreviousLoanBank previousLoanBankDetails;
	
	private String previousLoanRemark;

}
