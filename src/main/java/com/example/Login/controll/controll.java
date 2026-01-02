/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.controll;
import com.example.Login.DTO.Login;
import com.example.Login.DTO.RecuperarSenhaDto;
import com.example.Login.DTO.Sucesso;
import com.example.Login.service.ServiceLogin;
import com.example.Login.service.ServiceRecuperarSenha;
import com.example.Login.table.LoginEn;
import com.example.Login.service.service;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author gabri
 */
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/cadastro")
public class controll{
private final service Service;
private final ServiceLogin serviceLogin ;
private final ServiceRecuperarSenha serviceRecuperarSenha;
public controll(service Service, ServiceLogin serviceLogin,ServiceRecuperarSenha serviceRecuperarSenha){
    this.Service=Service;
    this.serviceLogin=serviceLogin;
    this.serviceRecuperarSenha=serviceRecuperarSenha;
}
    
@PostMapping("/Email")
public ResponseEntity<String>salva(@RequestBody LoginEn cadas){

    boolean Cadastro=Service.Cadastro(cadas);
    
    if(!Cadastro){
    return ResponseEntity
           .status(409)
           .body("E mail ja cadastrado");
    
    }
   return ResponseEntity
          .status(201)
           .body("usuario cadastrado com sucesso");
    
  }

@PostMapping("/login")
public ResponseEntity<?>Login(@RequestBody Login dto){
   Sucesso resposta=serviceLogin.Autentificar(dto);
  
   if(!resposta.isSucesso()){
       return ResponseEntity.status(401).body(resposta);
  }
return ResponseEntity.ok(resposta);
  }


@PostMapping("/EmailVeri")
public ResponseEntity<Sucesso>VerificarEmail(@RequestBody RecuperarSenhaDto dto){
Sucesso resposta=serviceRecuperarSenha.VerificarEmail(dto);
if(!resposta.isSucesso()){
    return ResponseEntity.status(404).body(resposta);
    }
    return ResponseEntity.ok(resposta);

   }

@PostMapping("/Novasenha")
public ResponseEntity<Sucesso>RecuperarSenha(@RequestBody RecuperarSenhaDto dto){
    Sucesso resposta=serviceRecuperarSenha.NovaSenha(dto);
    if(!resposta.isSucesso()){
    return ResponseEntity.status(404).body(resposta);
    }
    return ResponseEntity.ok(resposta);

   }
}