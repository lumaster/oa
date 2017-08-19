package com.oasw.repository;

import org.springframework.data.repository.CrudRepository;

import com.oasw.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User save(User user);

	User findByUserName(String userName);

}
