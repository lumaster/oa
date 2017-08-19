package com.oasw.controller;

import com.oasw.model.Customer;
import com.oasw.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public String customerPage(@ModelAttribute Customer customer) {
        return "customer";
    }

    @PostMapping("/customer")
    public String customer(@ModelAttribute Customer customer, @RequestParam HashMap<String, String> params, @RequestParam MultiValueMap<String, String> multipleParams) {

        try {
            customerService.saveCustomer(params);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "customer";
    }

    @RequestMapping("/customer-search")
    public String customerSearchPage() {
        return "customer-search";
    }



}
