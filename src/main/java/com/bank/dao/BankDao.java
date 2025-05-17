package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Bank;
import com.bank.repo.BankRepo;

@Repository
public class BankDao {
@Autowired
BankRepo br;
	
public String getPostAll(List<Bank> b) {
	br.saveAll(b);
	return "Posted All Obj Successfully";
}

public List<Bank> getAllObj() {
	return br.getAllObj();
}

public String getBranch(String i) {
	return br.getBranch(i);
}
}
