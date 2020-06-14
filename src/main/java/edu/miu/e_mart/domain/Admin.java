package edu.miu.e_mart.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import org.hibernate.annotations.Cascade;

//@Entity
//public class Admin {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int adminId;
//	// @NotEmpty(message = "{ }")
//	private String firstName;
//	// @NotEmpty(message = "{ }")
//	private String lastName;
//	// @Email(message="{ }")
//	
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private ARole role;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private ACredential credential;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private Address address;
//	
//	public Admin() {
//		super();
//	}
//
//	public Admin(int adminId, String firstName, String lastName, ARole role, ACredential credential, Address address) {
//		super();
//		this.adminId = adminId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.role = role;
//		this.credential = credential;
//		this.address = address;
//	}
//
//	public int getAdminId() {
//		return adminId;
//	}
//
//	public void setAdminId(int adminId) {
//		this.adminId = adminId;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public ARole getRole() {
//		return role;
//	}
//
//	public void setRole(ARole role) {
//		this.role = role;
//	}
//
//	public ACredential getCredential() {
//		return credential;
//	}
//
//	public void setCredential(ACredential credential) {
//		this.credential = credential;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	}
//	
//	
//	
	
	
	
	
	
	
	
