/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class ControladorLogica {
    
    ControladoraPersistencia controlPersis;
    
    public ControladorLogica(){ 
        
        controlPersis= new ControladoraPersistencia();
    }



    public String ValidarLogin(String nombreUsuario, String contrasenia) {
        
        String mensaje=" ";
        
        List<Usuario> listaUsuarios = controlPersis.ValidarLogin();
        
        for(Usuario usu : listaUsuarios){ 
            
            if(usu.getNombreDeUsuario().equals(nombreUsuario)){
                
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje = "Contraseña y usuario Correctos "+ '\n'+ " Bienvenido usuario: "+  usu.getNombreDeUsuario() ;
                    return mensaje;
                }else{
                     mensaje = "Usuario o contraseña Incorrecto";
                      return mensaje;
                }    
                }else{
                
                  mensaje = "Usuario no encontrado";
                 
                        }
               
            }
        return mensaje;
        System.out.println("Todo bien");
                

    }

    

    public void crearUsuarioAdmin() {
        
        Usuario usu = new Usuario(1,"jefferson.alquinga1998@gmail.com","Jeffers1997");
        
        controlPersis.crearUsuarioAdmin(usu);
    }
    
}
