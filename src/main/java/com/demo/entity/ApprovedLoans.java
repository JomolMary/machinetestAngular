package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ApprovedLoans {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appNo;
	private int verId;
	@ManyToOne
    @JoinColumn(name = "verId",insertable=false, updatable=false)
	private VerifiedLoans verifiedLoans;

}