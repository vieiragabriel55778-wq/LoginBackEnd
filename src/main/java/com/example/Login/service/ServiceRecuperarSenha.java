/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.service;
import com.example.Login.DTO.RecuperarSenhaDto;
import com.example.Login.DTO.Sucesso;
import com.example.Login.repositori.repositorio;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class ServiceRecuperarSenha {
private final repositorio res ;
private final BCryptPasswordEncoder passwordEsconder;    
private final  EmailService  emailService;

public ServiceRecuperarSenha(repositorio res,BCryptPasswordEncoder passwordEncoder, EmailService  emailService){
    this.res=res;
    this.passwordEsconder=passwordEncoder;
    this.emailService=emailService;
}

public Sucesso VerificarEmail(RecuperarSenhaDto veri){
return res.findByEmail(veri.getEmail())
        .map(user->{
        
            String codigo=String.valueOf(
            (int)(Math.random()*900000)+1000
            );
        
            System.out.println("codigo gerado"+codigo);
          
            emailService.enviarCodigo(veri.getEmail(),codigo);
        return new Sucesso(true,"Codigo enviado para e-mail");
        })
        .orElse(new Sucesso(false, "E-mail nao encontrado"));
    
    
    
}
        




public Sucesso NovaSenha(RecuperarSenhaDto NovaSenha){
   return res.findByEmail(NovaSenha.getEmail())
      .map(user->{
      String NovaSenhaCripto=passwordEsconder.encode(NovaSenha.getNovaSenha());
      user.setSenha(NovaSenhaCripto);
      res.save(user);
      return new Sucesso(true, "Senha Atualizada");
      })
      .orElse(new Sucesso(false,"Nao encontrado"));
  }
}
