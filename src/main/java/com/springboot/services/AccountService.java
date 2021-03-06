package com.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Account;
import com.springboot.repositories.AccountRepository;
import com.springboot.services.exceptions.ResourceNotFoundException;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	public List<Account> findAll(){
		return repository.findAll();
	}
	
	public Account findById(Long id) {
		Optional<Account> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Account insert(Account obj) {
		return repository.save(obj);
	}
	
	public void delet(Long id) {
		repository.deleteById(id);
		
	}
	
	public Account Update(Long id, Account obj) {
		Account entity = repository.getOne(id);
		
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Account entity, Account obj) {
		entity.deposit(obj.getBalance());
		
	}


}