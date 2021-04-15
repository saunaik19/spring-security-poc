package com.saurabh.example.service;

import com.saurabh.example.dao.UserRepository;
import com.saurabh.example.model.Users;
import com.saurabh.example.config.principal.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user=userRepository.findByUsername(username);
        if(Objects.isNull(user))
            throw new UsernameNotFoundException("No user found, who are you???");
        return new UserPrincipal(user);
    }
}
