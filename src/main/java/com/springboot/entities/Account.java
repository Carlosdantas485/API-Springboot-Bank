package com.springboot.entities;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer cpf;
	private String name;
	
	
	public Account(){
	}

	public Account(long id, Integer cpf, String name) {
		this.id = id;
		this.cpf = cpf;
		this.name = name;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
