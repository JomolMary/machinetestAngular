package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VerifiedLoans {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int verId;
	private int refNo;
	@ManyToOne
    @JoinColumn(name = "refNo",insertable=false, updatable=false)
	private LoanOfficer loanOfficer;

}