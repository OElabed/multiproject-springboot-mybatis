package com.zeldan.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeldan.model.Account;
import com.zeldan.service1.repository.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	private AccountRepository repository;
	
    @GetMapping("/api/account")
    public Account user() {
        return repository.selectAccountById(1);
    }
}
