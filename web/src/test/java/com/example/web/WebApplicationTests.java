package com.example.web;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.oasw.domain.User;
import com.oasw.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

	@Autowired
	private UserRepository repository;

	@Ignore
	@Test
	public void contextLoads() {
		User user = repository.findByUserName("admin");
		System.out.println(user.toString());
	}

}
