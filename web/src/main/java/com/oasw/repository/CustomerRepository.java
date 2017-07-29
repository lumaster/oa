package com.oasw.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.oasw.domain.Customer;

//@PreAuthorize("hasRole('USER')")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
