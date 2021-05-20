package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entities.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
