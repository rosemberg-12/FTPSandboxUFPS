/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author Rosemberg
 */
public class TableroDeJuego extends JPanel {


    public TableroDeJuego(){
    super();
    
    this.setSize(300, 300);
    this.setOpaque(false);
}

    @Override
    public void paint(Graphics g){
        
        ImageIcon ima= new ImageIcon(this.getClass().getResource("/ufps/Imagenes/fondo.png"));
        g.drawImage(ima.getImage(), 2, 2, null);
        
        super.paint(g);

        
     }



}