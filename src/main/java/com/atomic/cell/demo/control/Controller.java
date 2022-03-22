package com.atomic.cell.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atomic.cell.demo.entity.CustomerEntity;
import com.atomic.cell.demo.services.CustomerServices;


@RestController
@RequestMapping("/api")

public class Controller {

	
	@Autowired
	CustomerServices callService;

	// Select By id
	@GetMapping("/getAtomicUser/{id}")
	public ResponseEntity<CustomerEntity> findById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<>(callService.getRecordById(id), HttpStatus.OK);
	}
}
