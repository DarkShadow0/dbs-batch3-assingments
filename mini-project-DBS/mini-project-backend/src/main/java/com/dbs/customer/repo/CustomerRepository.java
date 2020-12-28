package com.dbs.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
