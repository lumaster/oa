package com.oasw.service;

import com.oasw.config.ApplicationContant;
import com.oasw.model.Customer;
import com.oasw.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public long saveCustomer(HashMap<String, String> params) throws ParseException {

        String fistName = params.get("firstName");
        String lastName = params.get("lastName");
        String hn = params.get("hn");
        String passportNumber = params.get("passportNumber");
        String birthDateStr = params.get("birthDate");
        String type = params.get("type");
        String accomendation = params.get("accomendation");
        String deliverService = params.get("deliverService");
        Date birthDate = ApplicationContant.simpleDateFormat.parse(birthDateStr);

        Customer customer = new Customer();
        customer.setFirstName(fistName);
        customer.setLastName(lastName);
        customer.setHn(hn);
        customer.setPassportNumber(passportNumber);
        customer.setBirthDate(birthDate);
        customer.setType(type);
        customer.setAccommodation(accomendation);
        customer.setDeliverService(deliverService);

        Customer save = customerRepository.save(customer);

        return 1;
    }

}
