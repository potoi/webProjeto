package br.edu.iftm.webprojeto;


import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iftm
 */
@Named
@SessionScoped
public class Bean implements Serializable {

    private String hello = "Olá mundo";
    
    public String getHello() {
        return hello;
    }
        
}