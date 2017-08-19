package com.oasw.repository;

import org.springframework.data.repository.CrudRepository;

import com.oasw.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
