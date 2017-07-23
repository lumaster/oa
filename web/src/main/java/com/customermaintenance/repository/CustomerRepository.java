package com.customermaintenance.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.customermaintenance.domain.Customer;

//@PreAuthorize("hasRole('USER')")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
