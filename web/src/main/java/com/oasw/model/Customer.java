package com.oasw.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_first_name")
    private String firstName;

    @Column(name = "customer_last_name")
    private String lastName;

    @Column(name = "customer_birth_date")
    private Date birthDate;

    @Column(name = "customer_hn")
    private  String hn;

    @Column(name = "customer_passport_number")
    private String passportNumber;

    @Column(name = "customer_type")
    private String type;

    @Column(name = "customer_accommodation")
    private String accommodation;

    @Column(name = "customer_delivery_service")
    private String deliverService;

    @Column(name = "customer_picture")
    private String picture;

    @CreatedBy
    @Column(name = "create_user")
    private String createUser;

    @CreatedDate
    @Temporal(TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @LastModifiedBy
    @Column(name = "update_user")
    private String updateUser;

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Date birthDate, String hn,
                    String passportNumber, String type, String accommodation, String deliverService, String picture,
                    String createUser, Date createDate, String updateUser, Date updateDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hn = hn;
        this.passportNumber = passportNumber;
        this.type = type;
        this.accommodation = accommodation;
        this.deliverService = deliverService;
        this.picture = picture;
        this.createUser = createUser;
        this.createDate = createDate;
        this.updateUser = updateUser;
        this.updateDate = updateDate;
    }


}
