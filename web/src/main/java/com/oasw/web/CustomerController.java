package com.oasw.web;

import com.oasw.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    @GetMapping("/customer")
    public String customerPage(@ModelAttribute Customer customer) {
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
