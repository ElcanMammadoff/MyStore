package com.bmt.MyStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        return http.authorizeHttpRequests(auth->auth
                .requestMatchers("/").permitAll()
                .requestMatchers("contact").permitAll()
                .requestMatchers("register").permitAll()
                .requestMatchers("store").permitAll()
                .requestMatchers("login").permitAll()
                .requestMatchers("logout").permitAll()
                .anyRequest().authenticated()).formLogin(form->form.defaultSuccessUrl("/",true))
                .logout(config->config.logoutSuccessUrl("/")).build();

    }


    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
