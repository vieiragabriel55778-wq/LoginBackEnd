/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.DTO;

/**
 *
 * @author gabri
 */
public class Login {
     String Email;
     String Senha;

     
     public Login(String Email,String Senha){
     this.Email=Email;
     this.Senha=Senha;
         
     }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
     
    
}
