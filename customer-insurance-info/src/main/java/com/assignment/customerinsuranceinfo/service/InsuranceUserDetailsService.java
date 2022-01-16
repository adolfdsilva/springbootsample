package com.assignment.customerinsuranceinfo.service;

import java.util.ArrayList;
import java.util.Map;

import com.assignment.customerinsuranceinfo.model.InsuranceUser;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class InsuranceUserDetailsService implements UserDetailsService {

    final Map<String, InsuranceUser> users = Map.of("adolf",
            new InsuranceUser("adolf", "$2a$12$lZX8RGn0kyXnsg0vMzKTYuQ8OMvZhWPK9RlrVUJw2vOn9RtXbFk4.",
                    new ArrayList<>(), 114533332L),
            "orphin", new InsuranceUser("orphin", "$2a$12$1Bcaq0UjOzoRyPpF82vQJuyz2.tn9Dy4EwxMqZ/Ioh.axeWRZx0j.",
                    new ArrayList<>(), 114533334L));

    @Override
    public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
        // use database for loading username
        return users.get(uname);
    }
}