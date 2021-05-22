package com.springboot.entities.enums;

public enum TipeAccount {
		Fisic_Person(1),
		Juridic_Person(2);
		
	
	private int code;
	
	private TipeAccount(int code) {
		this.code = code;
	}
	
	//metodo que tornaa visivel fora
	public int getCode() {
		return code;
		
	}
	//ira percorrer todos os tipos do TipeAccount
	public static TipeAccount valueOf(int code) {
		for (TipeAccount value : TipeAccount.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}