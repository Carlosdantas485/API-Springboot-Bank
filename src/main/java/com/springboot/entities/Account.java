package com.springboot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.entities.enums.TipeAccount;

@Entity
@Table(name = "tb_account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer tipeAccount;
	private String name;
	private Integer cpf;
	public double transferLimit;
	protected double balance;
	
	//nao fica em loop entre pedido e o usuario
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	
	public Account(){
	}
	
	public Account(Long id,TipeAccount tipeAccount, String name, Integer cpf, double transferLimit, double balance) {
		super();
		this.id = id;
		setTipeAccount(tipeAccount);
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

	public TipeAccount getTipeAccount() {
		return TipeAccount.valueOf(tipeAccount);
	}

	public void setTipeAccount(TipeAccount tipeAccount) {
		if(tipeAccount != null)
			this.tipeAccount = tipeAccount.getCode();
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

	public double getBalance() {
		return balance;
	}
	
	public List<Order> getOrders() {
		return orders;
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
