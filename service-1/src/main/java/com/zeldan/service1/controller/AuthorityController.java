package com.zeldan.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeldan.model.Authority;
import com.zeldan.service1.repository.AuthorityRepository;

@RestController
public class AuthorityController {
	
	@Autowired
	private AuthorityRepository repository;
	
    @GetMapping("/api/account")
    public Authority getAuthority() {
        return repository.selectAuthorityById(1);
    }
}
