/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.DTO;

/**
 *
 * @author gabri
 */
public class RecuperarSenhaDto {
    String Email;
    String NovaSenha;    

 public RecuperarSenhaDto(String Email, String NovaSenha){
 this.Email=Email;
 this.NovaSenha=NovaSenha;
 }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNovaSenha() {
        return NovaSenha;
    }

    public void setNovaSenha(String NovaSenha) {
        this.NovaSenha = NovaSenha;
    }
 
 

    
}
