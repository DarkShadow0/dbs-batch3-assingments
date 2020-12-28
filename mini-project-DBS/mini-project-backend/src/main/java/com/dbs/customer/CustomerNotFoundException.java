package com.dbs.customer;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(long id) {
		super("Emp not found with id: " + id);
	}
}
