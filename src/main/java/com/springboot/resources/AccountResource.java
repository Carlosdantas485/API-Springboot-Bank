package com.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.Account;

@RestController
@RequestMapping(value = "/accounts")
public class AccountResource {
	@GetMapping
	public ResponseEntity<Account> findAll(){
	
		Account Acc = new Account(1L, 987654321,"Carlos Dantas");
		return ResponseEntity.ok().body(Acc);
	}
}

