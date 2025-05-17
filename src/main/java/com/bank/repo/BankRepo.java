package com.bank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {
	
	@Query(value="SELECT * FROM bank_table", nativeQuery=true)
	public List<Bank> getAllObj();
	
	@Query(value="SELECT x.branch FROM Bank x WHERE x.ifsc=:i")
	public String getBranch(String i);

}
