package com.customermaintenance.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Customer implements Serializable {
	
	private @Version @JsonIgnore Long version;
	private @Id @GeneratedValue String customerId;
	private @Column(name = "first_name" )String firstName;
	private @Column(name = "last_name") String lastName;
	private @Column(name = "brith_date") Date birthDate;
	private @Column(name = "hm") String hn;
	private @Column(name = "passport_number") String passportNumber;
	private @Column(name = "type") String type;
	private @Column(name = "accommodation") String accommodation;
	private @Column(name = "delivery_service") String deliveryService;
	private @Column(name = "picture") String picture;
	private @Column(name = "create_user") String createUser;
	private @Column(name = "create_date") String createDate;
	private @Column(name = "update_user") String updateUser;
	private @Column(name = "update_date") String updateDate;

	private Customer() {
	}

	public Customer(String firstName, String lastName, Date birthDate, String hn,
			String passportNumber, String type, String accommodation, String deliveryService, String picture,
			String createUser, String createDate, String updateUser, String updateDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hn = hn;
		this.passportNumber = passportNumber;
		this.type = type;
		this.accommodation = accommodation;
		this.deliveryService = deliveryService;
		this.picture = picture;
		this.createUser = createUser;
		this.createDate = createDate;
		this.updateUser = updateUser;
		this.updateDate = updateDate;
	}


}
