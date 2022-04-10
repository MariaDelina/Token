
package com.pruebanueva.security.service;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserDetailsService implements UserDetailsService{

    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        return new User("usrinti@gmail.com", "{noop}holamundo", new ArrayList<>());
    }
    
}
