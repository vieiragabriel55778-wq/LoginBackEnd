/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.service;

import com.example.Login.DTO.Login;
import com.example.Login.DTO.Sucesso;
import com.example.Login.repositori.repositorio;
import java.util.regex.Pattern;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class ServiceLogin {
 
private final repositorio res ;
private final BCryptPasswordEncoder passwordEsconder;


 public ServiceLogin(BCryptPasswordEncoder passwordEsconder,repositorio res) {
        this.passwordEsconder = passwordEsconder;
        this.res=res;
 }
    
public Sucesso Autentificar(Login dto){
return res.findByEmail(dto.getEmail())
   .map(user->{
       if(!passwordEsconder.matches(dto.getSenha(),
               user.getSenha())){
        return new Sucesso(false,"Senha incorreta");
       }
       return new Sucesso(true,"login realizado");   
   })
    .orElse(new Sucesso(false,"Infelizmente não reconhecemos este e-mail"));
    
           
  }             
}
