package com.customermaintenance.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Value("${application.name}")
    String appName;

	 @RequestMapping("/")
	    public String homePage(Model model) {
	        model.addAttribute("appName", appName);
	        model.addAttribute("message", "Test Message");
	        return "login";
	    }
	    
	    @RequestMapping("/login")
	    public String loginPage(Model model) {
	        return "login";
	    }
	    
	    @RequestMapping("/admin")
	    public String adminPage() {
	        return "admin";
	    }

	    @RequestMapping("/customer")
	    public String customerPage() {
	        return "customer";
	    }
	    
	    @RequestMapping("/customer-search")
	    public String customerSearchPage() {
	        return "customer-search";
	    }
	    
	    @RequestMapping("/user")
	    public String userPage() {
	        return "user";
	    }
	    
	    @RequestMapping("/user-search")
	    public String userSearchPage() {
	        return "user-search";
	    }

}
