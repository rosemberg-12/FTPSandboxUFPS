/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.Mundo;

import ufps.util.ExceptionUFPS;
import ufps.util.ListaCD;
import ufps.util.Pila;
import ufps.util.ServicioFtp;

/**
 *
 * @author Rosemberg
 */
public class CenterFTP {
    
    private ServicioFtp server= null;
    private String posActual="/";
    private String user="";
    private Pila<String>direcciones=new Pila<String>();
    private String dirServer="";
    
    public CenterFTP(){
        
    }

    public void ingresar(String user, String pas, String webServer)throws ExceptionUFPS{

        if(user.isEmpty()||user==null || pas.isEmpty()||pas==null )
            throw new ExceptionUFPS("Uno de los campos de texto se encuentran vacios");
        
        server=new ServicioFtp(user, pas, webServer);
        
        if(!server.conectar()){
            server=null;
            throw new ExceptionUFPS("El usuario o la contraseña son erroneas, Vuelvalas a digitar");
            }
        
        System.out.println(server.dirActual());
        
        this.user=user;
        
        dirServer="sandbox1.ufps.edu.co/~"+this.user;

    }

    public ServicioFtp getServer() {
        return server;
    }

    public ListaCD<Archivo> getArchivos(String posActual, boolean tipo) {
        
        if(!posActual.equals(this.posActual)){
        this.posActual=posActual;
        System.out.println("El resultado del cambio fue "+this.server.goToDir(posActual)+" hacia "+this.server.dirActual());
        }
        
            System.out.println(this.server.dirActual());

            return obtenerListas(tipo);
              
    }
    
    public ListaCD<Archivo> obtenerListas(boolean tipo){
        
         ListaCD<String>val=this.server.listarConTipo();
         for(String v:val){
             System.out.println(v);
         }
         
         return listar(val, tipo);
    }
    
    private ListaCD<Archivo> listar(ListaCD<String> val, boolean tipo) {
                
        ListaCD<Archivo>retorna=new ListaCD<Archivo>();
        
        String comparacion="";
        if(tipo)
        comparacion="directorio";
        else
        comparacion="archivo";
        
        for(String cadena: val){
            
            String[]vector=cadena.split(";");
            
            String nombre=vector[0];
            String valor=vector[2];
            String fecha=hallarFecha(vector[1]);
            if(comparacion.equals(valor))

                retorna.addInicio(new Archivo(valor, nombre, fecha));

        }
        return retorna;
    }
    
    public String devolverse(){
        
        String aux="";
        
        if(!direcciones.esVacio()){
        aux=this.direcciones.pop();
        this.posActual=aux;
        this.server.atras();
        return aux;
        }
        
        return "/";
        
    }
    
    public void eliminar(String val){
        this.server.eliminar(val);
    }

    public boolean subir(String dirPos ,String nomArchivoASubir){
        
        return this.server.subirArchivo(dirPos, nomArchivoASubir);
        
        
    }
    
    public boolean crearCarpeta(String val){
        return this.server.crearCarpeta(val);
    }
    
    public boolean descargar(String disco, String host){
        return(this.server.descargarArchivo(disco, host));
    }

    public String getUser() {
        return user;
    }
    
    public String getLink(String actual){

               
        if(actual.equals("public_html"))
            return dirServer+"/";

        Pila<String>aux1=new Pila<String>();
        String auxCad="";
        String retorna="";
        
        
        while(!direcciones.esVacio()){
            
            auxCad=this.direcciones.pop();
            aux1.push(auxCad);
            if(auxCad.equals("public_html")){
                
                reordenar(aux1);
                return dirServer+"/"+retorna+actual;
            }
            
            retorna=auxCad+"/"+retorna;
            
        }
        reordenar(aux1);
        return null;
        
    }

    private void reordenar(Pila<String> aux1) {
        while(!aux1.esVacio()){
            direcciones.push(aux1.pop());
        }
    }

    public void actualizarPila(String posActual) {
        
        direcciones.push(posActual);
        
    }

    private String hallarFecha(String cadena) {
        int dato=-1;
        String[] meses=new String[12];
        meses[0]="Jan";
        meses[1]="Feb";
        meses[2]="Mar";
        meses[3]="Apr";
        meses[4]="May";
        meses[5]="Jun";
        meses[6]="Jul";
        meses[7]="Aug";
        meses[8]="Sep";
        meses[9]="Oct";
        meses[10]="Nov";
        meses[11]="Dec";
        
        for(int c=0; c<meses.length && dato==-1 ; c++){
            
            dato= cadena.indexOf(meses[c]);
            
        }
        
        return cadena.substring(dato, dato+12);
        
    }
    


  
    
}
