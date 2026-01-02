/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

/**
 *
 * @author gabri
 */
@Entity
@Table(name="LoginEn")        
public class LoginEn {
@Id        
@GeneratedValue(strategy = GenerationType.IDENTITY)       
private Long Id;

private String nome;
private String sobrenome;

@Column(unique = true)
private String email;

private String senha;
    
public LoginEn(){
}


public LoginEn(String nome,String sobrenome, String email,String senha){
this.nome=nome;
this.sobrenome=sobrenome;
this.email=email;
this.senha=senha;
}

    public Long getId() {
        return Id;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
