package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {
@Autowired
CustomerService cs;
	
	@PostMapping(value="/postAllCustObjects")
	public String getPostAllCustObj(@RequestBody List<Customer> c) {
		return cs.getPostAllCustObj(c);
		}
	
}
