package com.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springboot.entities.Account;
import com.springboot.repositories.AccountRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//o spring vai resolver a dependencia
	@Autowired
	private AccountRepository accountRepository ;
	
	@Override
	public void run(String... args) throws Exception {
		
		Account acc1 = new Account(null,"dantas Carlos", 123456789,300.0,100);
		Account acc2 = new Account(null,"Carlos Dantas", 123456789,300, 100);
		
		accountRepository.saveAll(Arrays.asList(acc1, acc2));
	}
	
	
}
