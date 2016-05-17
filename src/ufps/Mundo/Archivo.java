/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.Mundo;

/**
 *
 * @author Rosemberg
 */
public class Archivo {
    private String tipo;
    private String nombre;
    private String fecha;
    
    public Archivo(String tipo, String nombre, String fecha){
        
        this.tipo=tipo;
        this.nombre=nombre;
        this.fecha=fecha;
               
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    

    
}
