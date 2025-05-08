package com.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;
import com.customer.repo.CustomerRepo;

@Repository
public class CustomerDao {
@Autowired
CustomerRepo cr;

public String getPostAllCustObj(List<Customer> c) {
	cr.saveAll(c);
	return "Posted success";
}
}
