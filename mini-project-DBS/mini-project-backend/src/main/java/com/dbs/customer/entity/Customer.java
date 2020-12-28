package com.dbs.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@Column(name="CUSTOMERID")
	private int customerId;
	
	@Column(name="CUSTOMERNAME")
	private String customerName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="MOBILENO")
	private String mobileNo;
	
	
	public Customer() {
		
	}

	public Customer(int customerId, String customerName, String address, String email, String mobileNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setCity(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}	
	
	
}
