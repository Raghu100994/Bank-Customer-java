package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Bank;
import com.bank.service.BankService;

@RestController
public class BankController {
@Autowired
BankService bs;

@PostMapping(value="/postAllObjects")
public String getPostAll(@RequestBody List<Bank> b) {
	return bs.getPostAll(b);
}

@GetMapping(value="/getAllObjects")
public List<Bank> getAllObj() {
	return bs.getAllObj();
}

@GetMapping(value="/getBranchByIfsc/{i}")
public String getBranch(@PathVariable String i) {
	return bs.getBranch(i);
} 
}
