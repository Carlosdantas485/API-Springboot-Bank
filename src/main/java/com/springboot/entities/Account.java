package com.springboot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer cpf;
	public double transferLimit;
	protected double balance;
	
	public Account(){
	}
	
	public Account(Long id, String name, Integer cpf, double transferLimit, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.transferLimit = transferLimit;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public double getLoanLimit() {
		return transferLimit;
	}

	public void setLoanLimit(double transfernLimit) {
		this.transferLimit = transfernLimit;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if(amount <= transferLimit && amount > 0)
			balance -= amount;
		
		if(amount > transferLimit) 
			System.out.println("Your limit is less than the value entered");
		
		else 
			System.out.println("invalid amount for withdraw !");
		
		
	}
	public void deposit(double amount) {
		if(amount <= transferLimit && amount > 0 )
			balance += amount;
		
		if(amount > balance)
			System.out.println("Your limit is less than the value entered");
			
		else 
			System.out.println("invalid amount for deposit !");
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
	}


}
