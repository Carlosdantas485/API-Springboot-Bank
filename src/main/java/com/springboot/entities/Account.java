package com.springboot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private double transferLimit;
	protected double balance;

	public Account() {
	}

	public Account(Long id, TipeAccount tipeAccount, String name, Integer cpf, Integer cnpj, String socialReason,
			String fantasyName, double transferLimit, double balance) {
		super();
		this.id = id;
		setTipeAccount(tipeAccount);
		this.name = name;
		this.cpf = cpf;
		this.transferLimit = 500.0;
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
		if (tipeAccount != null)
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

	public double getTransferLimit() {
		return transferLimit;
	}

	public void setTransferLimit(double transferLimit) {
		this.transferLimit = transferLimit;
	}

	public double getBalance() {
		return balance;
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

	@Override
	public String toString() {
		return "Account [id=" + id + ", tipeAccount=" + tipeAccount + ", name=" + name + ", cpf=" + cpf
				+ ", transferLimit=" + transferLimit + ", balance=" + balance + "]";
	}

}