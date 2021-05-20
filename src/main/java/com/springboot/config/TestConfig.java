package com.springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springboot.entities.Account;
import com.springboot.entities.Order;
import com.springboot.entities.enums.TipeAccount;
import com.springboot.repositories.AccountRepository;
import com.springboot.repositories.OrderRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//o spring vai resolver a dependencia
	@Autowired
	private AccountRepository accountRepository ;
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Account acc1 = new Account(null,TipeAccount.Account_Fisic_Person,"dantas Carlos", 123456789,500.0,100);
		Account acc2 = new Account(null,TipeAccount.Account_Juridic_Person,"Carlos Dantas", 123456789,500, 100);
		
		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), acc1);
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), acc2);
		Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), acc1);
		
		accountRepository.saveAll(Arrays.asList(acc1, acc2));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
	}
	
	
}
