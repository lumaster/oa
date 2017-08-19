package com.oasw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class MainController {

    @Value("${application.name}")
    String appName;

    @RequestMapping("/")
    public String homePage(Model model) {
        return "login";
    }

    @GetMapping("/login")
    public ModelAndView loginPage(String error, String logout) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        if (error != null)
            modelAndView.addObject("message", "Your username and password is invalid.");
        modelAndView.addObject("errorMessage", "XXXXXXXXXXXX");
        return modelAndView;
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
