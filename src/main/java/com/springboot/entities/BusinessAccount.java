package com.springboot.entities;

import com.springboot.entities.enums.TipeAccount;

public class BusinessAccount extends Account{

	private static final long serialVersionUID = 1L;
	private Integer cnpj;
	private String socialReason;
	private String fantasyName;
	
	public BusinessAccount(){
	}

	public BusinessAccount(Long id,TipeAccount tipeAccount, String name, Integer cpf, double loanLimit, double balance, Integer cnpj,
			String socialReason, String fantasyName) {
		super(id,tipeAccount, name, cpf, loanLimit, balance);
		this.cnpj = cnpj;
		this.socialReason = socialReason;
		this.fantasyName = fantasyName;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}
	
	
	
	
}
