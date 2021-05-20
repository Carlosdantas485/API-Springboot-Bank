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
		
		Account Account1 = new Account();

		return ResponseEntity.ok().body(Account1);
	}	
}

