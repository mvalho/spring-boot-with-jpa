package com.mvalho.entity;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "person_id")
	private Long id;
	private String name;

	@Temporal(TemporalType.DATE)
	private Calendar dateOfBirth;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="person")
	private List<Contact> contacts;
	
	public Person() {}
	
	public Person(String name, Calendar dateOfBirth, Contact ... contacts) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.contacts = Arrays.asList(contacts);
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
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
