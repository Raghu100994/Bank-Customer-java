package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;

@Service
public class CustomerService {
@Autowired
RestTemplate rt;
@Autowired
CustomerDao cd;

		public String getPostAllCustObj(List<Customer> c) {
			String url4="http://localhost:8083/getBranchByIfsc/";
			c.forEach(x-> {
				ResponseEntity <String> br=rt.exchange(url4+x.getIfsc(), HttpMethod.GET, null, String.class);
				x.setBranch(br.getBody());
			});
				
			return cd.getPostAllCustObj(c);
	}
}
