package com.zeldan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeldan.model.Privilege;
import com.zeldan.repository.PrivilegeRepository;

@RestController
public class PrivilegeController {

	@Autowired
	private PrivilegeRepository repository;

	@GetMapping("/api/privilege")
	public Privilege getPrivilege() {
		return repository.selectPrivilegeById(1);
	}

}
