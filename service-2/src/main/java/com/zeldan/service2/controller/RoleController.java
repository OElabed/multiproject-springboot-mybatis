package com.zeldan.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeldan.model.Role;
import com.zeldan.service2.repository.RoleRepository;

@RestController
public class RoleController {
	
	@Autowired
	private RoleRepository repository;

    @GetMapping("/api/role")
    public Role user() {
        return repository.selectRoleById(1);
    }
}
