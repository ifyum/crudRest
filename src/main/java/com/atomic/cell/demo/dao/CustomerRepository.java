package com.atomic.cell.demo.dao;

import com.atomic.cell.demo.entity.CustomerEntity;

public interface CustomerRepository {
	CustomerEntity getRecordById(Long id);
	

}
