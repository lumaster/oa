package com.oasw.config;

import com.oasw.domain.User;
import com.oasw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        ServletRequestAttributes attr = (ServletRequestAttributes)
                RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);

        String userName = String.valueOf(authentication.getPrincipal());
        String password = String.valueOf(authentication.getCredentials());
        User user = userRepository.findByUserName(userName);

        if (user != null && User.PASSWORD_ENCODER.matches(password, user.getPassword())) {
            session.setAttribute("user", user);
            return new UsernamePasswordAuthenticationToken(
                    user.getUserName(), user.getPassword(), authentication.getAuthorities());
        } else {
            return null;
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
                UsernamePasswordAuthenticationToken.class);
    }
}
