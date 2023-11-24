package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class LoanOfficer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int refNo;
	private int custNo;
	@ManyToOne
    @JoinColumn(name = "custNo",insertable=false, updatable=false)
	private CustomerDetails customerDetails;
	
	
	

}