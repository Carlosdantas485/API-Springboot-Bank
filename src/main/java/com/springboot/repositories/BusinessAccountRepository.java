package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entities.Account;


public interface BusinessAccountRepository extends JpaRepository<Account, Long> {
	
}