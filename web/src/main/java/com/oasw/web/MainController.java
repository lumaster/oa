package com.oasw.web;

import com.oasw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Value("${application.name}")
    String appName;

    @RequestMapping("/")
    public String homePage(Model model) {
        return "login";
    }

    @GetMapping("/login")
    public String loginPage(Model model, String error, String logout) {
        return "login";
    }

    @GetMapping("/admin")
    public String adminPage(HttpServletRequest request) {
        return "admin";
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
