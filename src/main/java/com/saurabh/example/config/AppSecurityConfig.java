package com.saurabh.example.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    protected UserDetailsService userDetailsService(){

        List<UserDetails> userDetails=new ArrayList<>();
        userDetails.add(User.withDefaultPasswordEncoder().username("saurabh").password("1234").roles("USER").build());
        return new InMemoryUserDetailsManager(userDetails);
    }
}
