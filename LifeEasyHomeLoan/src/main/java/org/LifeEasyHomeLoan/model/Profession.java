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
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Integer professionId;

	private String professionType;
	
	private Double professionsalary;

	
	private String professionDesignation;

	@Lob
	private byte[] professionSalarslip;
	




	
	
	
}
