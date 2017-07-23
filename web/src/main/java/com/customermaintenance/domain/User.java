package com.customermaintenance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "password")
@Entity(name="user")
public class User{

	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
	private @Id @Column(name = "user_id" ) int userId;
	private @Column(name = "username" )String userName;
	private @Column(name = "user_password" )@JsonIgnore String password;
	private @Column(name = "user_first_name" ) String firstName;
	private @Column(name = "user_last_name" ) String lastName;
	private @Column(name = "user_role" ) String role;

	public void setPassword(String password) {
		this.password = PASSWORD_ENCODER.encode(password);
	}

	protected User() {}

	public User(int userId, String userName, String password, String firstName, String lastName, String role) {
		this.userId = userId;
		this.userName = userName;
		setPassword(password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}


}
