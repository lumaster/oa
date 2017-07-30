package com.oasw.web;

import com.oasw.domain.User;
import com.oasw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/login")
    public String loginPage(HttpServletRequest request) {

        request.getSession().removeAttribute("user");
        return "login";
    }


    @RequestMapping("/admin")
    public String adminPage() {

//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (!(authentication instanceof AnonymousAuthenticationToken)) {
//            String userName = authentication.getName();
//            User user = userRepository.findByUserName(userName);
//            request.getSession().setAttribute("user", user);
//        }

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
