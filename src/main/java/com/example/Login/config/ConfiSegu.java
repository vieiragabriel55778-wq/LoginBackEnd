/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 *
 * @author gabri
 */
@Configuration
public class ConfiSegu {
    
@Bean
public BCryptPasswordEncoder PasswordEsconder(){

return new BCryptPasswordEncoder();
  }
    
}
