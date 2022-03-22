package com.atomic.cell.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atomic.cell.demo.dao.CustomerRepository;
import com.atomic.cell.demo.entity.CustomerEntity;

@Repository
public class CustomerRepositoryDao implements CustomerRepository {

	@Autowired
	JdbcTemplate jdbctemplate;

	static final String SELECT_WHERE_ID = "select * from customer where id=?";

	@SuppressWarnings("deprecation")
	@Override
	public CustomerEntity getRecordById(Long id) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity = jdbctemplate.queryForObject(SELECT_WHERE_ID, new Object[] { id },
				new BeanPropertyRowMapper<CustomerEntity>(CustomerEntity.class));
		return customerEntity;
	}

}
