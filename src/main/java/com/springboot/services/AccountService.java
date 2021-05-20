package com.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Account;
import com.springboot.repositories.AccountRepository;


@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	public List<Account> findAll(){
		return repository.findAll();
	}
	
	public Account findById(Long id) {
		Optional<Account> obj = repository.findById(id);
		return obj.get();
	}

}