/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.GUI;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Hashtable;


import javax.swing.*;


public class RenderLista extends JLabel implements ListCellRenderer{
 
 Hashtable<Object, ImageIcon> elementos;
  
 public RenderLista(){
     
  elementos=new Hashtable<Object, ImageIcon>();
  ImageIcon icono1=new ImageIcon(this.getClass().getResource("/ufps/Imagenes/archivo.png"));
  ImageIcon icono2=new ImageIcon(this.getClass().getResource("/ufps/Imagenes/carpeta.jpg"));
  elementos.put("archivo", icono1);
  elementos.put("directorio", icono2);
  
 }


 @Override
 public Component getListCellRendererComponent(JList list, Object value,int index, boolean isSelected, boolean cellHasFocus) {
     
        String[] dato=value.toString().split("Ð");
        
        setIcon(elementos.get(dato[1]));//aca pongo el icono
        
        setText(dato[0]);//aca pongo el texto
        
            if(isSelected){
                setFont(new Font("Verdana",Font.BOLD,16));
            }        
            else{
                setFont(null);
            }

    return this;
 }
}
