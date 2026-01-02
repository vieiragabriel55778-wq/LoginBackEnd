/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.service;

import com.example.Login.repositori.repositorio;
import com.example.Login.table.LoginEn;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class service{

private final repositorio res;
private final BCryptPasswordEncoder passwordEsconder;

public service(repositorio res,BCryptPasswordEncoder passwordEncoder){
this.res=res;
this.passwordEsconder=passwordEncoder;
}

public Boolean Cadastro(LoginEn cadas){
if(res.findByEmail(cadas.getEmail()).isPresent()){
return false;
}

String senhaCripto=passwordEsconder.encode(cadas.getSenha());
cadas.setSenha(senhaCripto);

res.save(cadas);
return true;
}

};
