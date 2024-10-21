/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author JEFFERSON ALQUINGA
 */

@Entity
public class usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private int id;
    
    @Basic
    private String nombreDeUsuario;
    @Basic
    private String contrasenia;

    public usuario() {
    }

    public usuario(int id,String nombreDeUsuario, String contrasenia) {
        this.id = id;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasenia = contrasenia;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
   
    public String getCorreo() {
        return nombreDeUsuario;
    }

    public void setCorreo(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contrasenia;
    }

    public void setContraseña(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
}
