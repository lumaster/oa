package com.oasw.web;

import com.oasw.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @RequestMapping("/customer")
    public String customerPage() {
        return "customer";
    }

    @PostMapping("/customer")
    public String customer(@ModelAttribute Customer customer) {
        return "customer";
    }

    @RequestMapping("/customer-search")
    public String customerSearchPage() {
        return "customer-search";
    }



}
