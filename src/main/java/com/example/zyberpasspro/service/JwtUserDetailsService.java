package com.example.zyberpasspro.service;


import com.example.zyberpasspro.model.Register;
import com.example.zyberpasspro.repository.RegisterRepository;
import com.example.zyberpasspro.repository.UserRepository;
import org.hibernate.hql.internal.ast.DetailedSemanticException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;



    @Service
    public class JwtUserDetailsService implements UserDetailsService {

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            if ("motipa@gmail.com".equals(username)) {
                return new User("motipa@gmail.com", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
                        new ArrayList<>());
            } else {
                throw new UsernameNotFoundException("User not found with username: " + username);
            }
        }

    }



