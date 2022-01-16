package com.assignment.customerinsuranceinfo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
        //use database for loading username and hashed password
        return new User("adolf", "$2a$12$lZX8RGn0kyXnsg0vMzKTYuQ8OMvZhWPK9RlrVUJw2vOn9RtXbFk4.",
                new ArrayList<>());
    }
}