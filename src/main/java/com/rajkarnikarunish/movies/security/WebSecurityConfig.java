//package com.rajkarnikarunish.movies.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends SecurityConfigurerAdapter {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable().cors().disable();
//        http.authorizeHttpRequests()
//                .requestMatchers("/api/v1/movies/", "/api/v1/movies/**", "/api/v1/auth/register").permitAll();
//        return http.build();
//    }
//}
