package com.atomic.cell.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atomic.cell.demo.dao.CustomerRepository;
import com.atomic.cell.demo.entity.CustomerEntity;
import com.atomic.cell.demo.services.CustomerServices;


@Service
public class CustomerServicesImpl implements CustomerServices {
	
	
	@Autowired 
	CustomerRepository customerRepository;

	@Override
	public CustomerEntity getRecordById(Long id) {
		return customerRepository.getRecordById(id);
	
	}

}
