/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.GUI;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Rosemberg
 */
public class HiloDeProceso extends Thread{
    
    private FormOperaciones myForm;
    private boolean val;
    private File dato;
    private String cadena;
    
    public HiloDeProceso(File c, boolean tipo, String nom, FormOperaciones fm ){
        this.myForm=fm;
        this.dato=c;
        this.val=tipo;
        this.cadena=nom;
    }
    
    @Override
    public void run(){
        
    String cad="";
        
        if(val){
            
                    
            if(!myForm.getFormPrincipal().getCentro().descargar(this.dato.getAbsolutePath()+"\\"+this.cadena, this.cadena))
                 cad="Ha ocurrido un error en la Descarga del archivo, la operacion no se ha llevado con satisfaccion";
            
            else
                cad="El archivo fue descargado en " +this.dato.getAbsolutePath();
            
            this.myForm.encenterTodo(cad);
        
        }
        
        else{
            
            if(!myForm.getFormPrincipal().getCentro().subir(dato.getAbsolutePath(), dato.getName()))
                cad="Ha ocurrido un error en la Carga del archivo, la operacion no se ha llevado con satisfaccion";
            
            else
                cad="El archivo fue subido exitosamente";
            
            this.myForm.encenterTodo(cad);
            
            this.myForm.actualizarListadoArchivos();
            
        }

    }
    
}
