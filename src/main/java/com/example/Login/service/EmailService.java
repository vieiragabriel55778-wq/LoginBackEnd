/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class EmailService {

    public void enviarCodigo(String email, String codigo) {
        System.out.println("📧 SIMULACAO DE EMAIL");
        System.out.println("Para: " + email);
        System.out.println("Codigo enviado: " + codigo);
        System.out.println("Expira em 10 minutos");
    }
}