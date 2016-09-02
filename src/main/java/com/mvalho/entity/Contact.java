package com.mvalho.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "contact_id")
	private Long id;
	
	@Column(name = "contact_type")
	private ContactType type;
	
	private String value;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ContactType getType() {
		return type;
	}
	public void setType(ContactType type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
