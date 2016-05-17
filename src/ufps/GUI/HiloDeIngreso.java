/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import ufps.Mundo.CenterFTP;
import ufps.util.ExceptionUFPS;

/**
 *
 * @author Rosemberg
 */
public class HiloDeIngreso extends Thread  {
    
   
    private String user;
    private  String pas;
    private String dir;
    private FormRegistro myForm;
    
    public HiloDeIngreso(String user, String pas, String dir, FormRegistro xD){
        
       
        this.user=user;
        this.pas=pas;
        this.dir=dir;
        this.myForm=xD;

    }
    
    @Override
    public void run(){
        
        try {
            
            this.myForm.getCentro().ingresar(user, pas, "sandbox1.ufps.edu.co");
            myForm.confirmarEvento(true, "");
            
        } catch (ExceptionUFPS ex) {
            myForm.confirmarEvento(false, ex.getMessage());
        }
        
        
    }
    
    
    
}
