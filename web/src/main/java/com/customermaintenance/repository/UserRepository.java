package com.customermaintenance.repository;

import org.springframework.data.repository.CrudRepository;

import com.customermaintenance.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User save(User user);

	User findByUserName(String userName);

}
