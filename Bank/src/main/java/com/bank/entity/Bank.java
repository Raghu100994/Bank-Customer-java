package com.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="bank_table")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String bank_Name;
	private String ifsc;
	private String branch;
	
	
	
}
