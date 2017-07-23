package com.customermaintenance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.customermaintenance.domain.Customer;
import com.customermaintenance.domain.User;
import com.customermaintenance.repository.CustomerRepository;
import com.customermaintenance.repository.UserRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final CustomerRepository customerRepository;
	private final UserRepository userRepository;

	@Autowired
	public DatabaseLoader(CustomerRepository customerRepository,UserRepository userRepository) {
		this.customerRepository = customerRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
//		
//		User user = userRepository.findByUserName("admin");
//		System.out.println(user.toString());
//		
		//this.userRepository.save(new User("Winiton", "Chanapolchai","admins", "admin", "USER"));
		
//		SecurityContextHolder.getContext().setAuthentication(
//				new UsernamePasswordAuthenticationToken("admins", "doesn't matter",
//					AuthorityUtils.createAuthorityList("USER")));
//
//		this.customerRepository.save(new Customer("admin1", "admin", "USER"));
//		this.customerRepository.save(new Customer("admin2", "admin", "USER"));
//		this.customerRepository.save(new Customer("admin3", "admin", "USER"));

		//SecurityContextHolder.clearContext();
	}
}
// end::code[]