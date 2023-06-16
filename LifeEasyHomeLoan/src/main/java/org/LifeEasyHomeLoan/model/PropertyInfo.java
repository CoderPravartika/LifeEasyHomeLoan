package org.LifeEasyHomeLoan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class PropertyInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer propertyId;
	
	private String propertyType;
	
	private String propertyArea;
	
	private String constructionArea;
	
	private Double propertyPrice;
	
	private Double constrctionPrice;
	@Lob
	private byte[] propertyDocuments;
	@Lob
	private byte[] propertyPriceProof;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PropertyAddress propertyaddress;
	
	
	
	
}
