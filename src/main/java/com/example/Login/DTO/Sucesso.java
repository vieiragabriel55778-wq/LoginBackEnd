/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.DTO;

/**
 *
 * @author gabri
 */

public class Sucesso {
   private  boolean Sucesso;
   private  String mensagem;
    
 public Sucesso(boolean Sucesso,String mensagem){
this.Sucesso=Sucesso;
this.mensagem=mensagem;
 }   
 
 public boolean isSucesso(){
 return Sucesso;
 }

    public String getMensagem() {
        return mensagem;
    }

 
 
    
}
