package com.devpenha.dsvendas.entities;

public class Seller implements java.io.Serializable {
	
	private Long id;
	private String name;
	
	public Seller() {
		
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
	
	

}
