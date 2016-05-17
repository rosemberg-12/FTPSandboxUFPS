/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.GUI;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Rosemberg
 */
public class HiloConexion extends Thread {
    
    private FormOperaciones myOperaciones=null;
    
    public HiloConexion(FormOperaciones myO){
        
        this.myOperaciones=myO;
        
    }
    
    @Override
    public void run(){
        
while(true)
        if(!testConeccion())
           this.myOperaciones.cancelarPrograma();
        
        
    }
    
    public boolean testConeccion() {
        try {

    		InetAddress address = InetAddress.getByName("java.sun.com");

    		if(address == null)
    			{
    				return false;
    			}

    		} catch (UnknownHostException e) {
    			
    			return false;
    		}
    		catch (IOException e) {
    			return false;
    		}
    		return true;
    }
    
}
